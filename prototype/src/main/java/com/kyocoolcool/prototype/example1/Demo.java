package com.kyocoolcool.prototype.example1;

import java.io.IOException;
import java.util.Date;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/10 6:54 PM
 */
public class Demo {
    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        Date date = new Date();
        Video video = new Video("StarWars", date);
        System.out.println("video:"+video);
        System.out.println("video hash:"+video.hashCode());
        Video video2 = (Video) video.clone();
        System.out.println("video2:"+video2);
        System.out.println("video2 hash:"+video2.hashCode());
        System.out.println("------------------------");
        video.setName("KingKong");
        System.out.println("video:"+video);
        System.out.println("video hash:"+video.hashCode());
        System.out.println("video2:"+video2);
        System.out.println("video2 hash:"+video2.hashCode());
        System.out.println("------------------------");
        date.setTime(123456789);
        video.setCreateTime(date);
        System.out.println("video:"+video);
        System.out.println("video hash:"+video.hashCode());
        System.out.println("video2:"+video2);
        System.out.println("video2 hash:"+video2.hashCode());
    }
}
