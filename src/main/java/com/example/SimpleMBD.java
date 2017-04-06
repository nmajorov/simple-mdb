

package com.example;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.QueueConnectionFactory;
import javax.jms.Session;

/**
 * @author wangchao
 *
 */
@MessageDriven(name = "TestMD", activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
        @ActivationConfigProperty(propertyName = "destination", propertyValue = "java:jboss/jms/ImageConversionQueue") })
public class SimpleMBD implements MessageListener {


    @Override
    public void onMessage(Message msg) {
        System.out.println("### OnMessage working..." + msg);
    }

}

