package org.bl.spring.config;

import org.apache.log4j.Logger;
import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.WebConfig;

import javax.servlet.ServletException;

/**
 * Created by bl on 11.04.2016.
 */
public class Bservlet extends ServletContainer {
private final static Logger LOG = Logger.getLogger(Bservlet.class);

    @Override
    protected void init(WebConfig webConfig) throws ServletException {
        super.init(webConfig);
        LOG.info("____________________________________________");
        System.out.println("!!!!!!!!!!!!!!!!");
    }
}
