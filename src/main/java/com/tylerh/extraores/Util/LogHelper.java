package com.tylerh.extraores.Util;

import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

/**
 * Created by Tyler on 4/29/2016.
 */
public class LogHelper
{
    private static Logger logger;
    public static void initLog(Logger log)
    {
        logger = log;
    }
    public static void log(Level logLevel, Object object)
    {
        logger.log(logLevel,object);
    }

    public static void all(Object object)
    {
        log(Level.ALL, object);
    }
    public static void debug(Object object)
    {
        log(Level.DEBUG, object);
    }
    public static void error(Object object)
    {
        log(Level.ERROR, object);
    }
    public static void fatal(Object object)
    {
        log(Level.FATAL, object);
    }
    public static void info(Object object)
    {
        log(Level.INFO, object);
    }
    public static void off(Object object)
    {
        log(Level.OFF, object);
    }
    public static void trace(Object object)
    {
        log(Level.TRACE, object);
    }
    public static void warn(Object object)
    {
        log(Level.WARN, object);
    }
}
