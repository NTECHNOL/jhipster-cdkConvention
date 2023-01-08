package com.nianthiotech.cdkconvention;

import com.nianthiotech.cdkconvention.CdkConventionApp;
import com.nianthiotech.cdkconvention.config.AsyncSyncConfiguration;
import com.nianthiotech.cdkconvention.config.EmbeddedElasticsearch;
import com.nianthiotech.cdkconvention.config.EmbeddedSQL;
import com.nianthiotech.cdkconvention.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { CdkConventionApp.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
