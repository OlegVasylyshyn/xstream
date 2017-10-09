package com.dexter.xstream;

import com.thoughtworks.xstream.XStream;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);

        List<SubEntity> subEntityList = new ArrayList<>();
        subEntityList.add(new SubEntity("SubEntity name", integerList, "Ignored field"));
        subEntityList.add(new SubEntity("SubEntity name", integerList, "Ignored field"));
        subEntityList.add(new SubEntity("SubEntity name", integerList, "Ignored field"));


        Entity entity = new Entity("Entity name",
                55,
                new SubEntity("SubEntity name", integerList, "Ignored field"),
                subEntityList);

        XStream xStream = new XStream();
//        xStream.autodetectAnnotations(true);

        xStream.alias("entity", Entity.class);
        xStream.alias("subentity", SubEntity.class);
        xStream.setMode(XStream.NO_REFERENCES);
        String xml = xStream.toXML(entity);


        System.out.println(xml);
        System.out.println(xStream.fromXML(xml));

    }

}
