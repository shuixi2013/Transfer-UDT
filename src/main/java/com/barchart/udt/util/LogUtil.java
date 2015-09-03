package com.barchart.udt.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.PropertyConfigurator;

public class LogUtil {
	
	public static void configureLog(){
		final Properties props = new Properties();
        FileInputStream logfis = null;
        try {
            logfis = new FileInputStream(new File("log4j.properties"));
            props.load(logfis);
            PropertyConfigurator.configure(props);
        } catch (final IOException e) {
        }
       finally {
           IOUtils.closeQuietly(logfis);
       }
	}
}
