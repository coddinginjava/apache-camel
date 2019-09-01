package sai.service.apachecamel;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.file.GenericFile;
import org.apache.camel.component.file.GenericFileFilter;
import org.springframework.stereotype.Component;
import sun.net.www.content.text.Generic;

import java.io.File;

@Component
public class Routingfiles extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        from("file://{{user.home}}/Desktop/in?noop=false&recursive=true&include=.*\\.txt&")
//                .filter( exchange ->  exchange.getIn().getBody(File.class).)
                .routeId("executeFileComponent")
                .to("file://{{user.home}}/Desktop/out/txt");

        //if its .txt file it has to go into {{user.home}}/Desktop/out/txt
        //if its .mp3 file it has to go into {{user.home}}/Desktop/out/mp3

    }
}
