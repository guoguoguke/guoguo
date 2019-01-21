package com.sinosoft.commxg.config;

import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

/**
 * mybatis配置
 */
@Configuration
public class SessionFactoryConfiguration {

    @Value("${mybatis.mybatisConfigFilePath}")
    private String mybatisConfigFilePath;
    @Value("${mybatis.mapperPath}")
    private String mapperPath;
    @Value("${mybatis.entityPackage}")
    private String entityPackage;

    @Value("${pagehelper.offsetAsPageNum}")
    private String offsetAsPageNum;
    @Value("${pagehelper.rowBoundsWithCount}")
    private String rowBoundsWithCount;

    @Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;


    @Bean(name="sqlSessionFactory")
    public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(mybatisConfigFilePath));
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        String packageSearchPath = PathMatchingResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + mapperPath;
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(packageSearchPath));
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage(entityPackage);

        //设置MyBatis分页插件
        PageInterceptor pageInterceptor = this.initPageInterceptor();
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{pageInterceptor});

        return sqlSessionFactoryBean;
    }

    public PageInterceptor initPageInterceptor(){
        PageInterceptor pageInterceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum", offsetAsPageNum);
        properties.setProperty("rowBoundsWithCount", rowBoundsWithCount);
        pageInterceptor.setProperties(properties);
        return pageInterceptor;
    }
}
