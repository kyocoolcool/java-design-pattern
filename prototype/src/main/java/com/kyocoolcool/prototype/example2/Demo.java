package com.kyocoolcool.prototype.example2;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author 陳金昌 Chris Chen
 * @version 1.0 2021/5/10 6:54 PM
 */
public class Demo {
    public static void main(String[] args) throws IOException, CloneNotSupportedException, InterruptedException {
        Date date = new Date();
        Video video = new Video("StarWars", date);
        LocalDateTime before = LocalDateTime.now();
        for (int i = 0; i < 100000 ; i++) {
            Video video2 = new Video("StarWars", date);
        }
        LocalDateTime after = LocalDateTime.now();
        System.out.println("new: "+Duration.between(before, after).toNanos());



        LocalDateTime before2 = LocalDateTime.now();
        for (int i = 0; i < 100000 ; i++) {
            Video video3 = (Video) video.clone();
        }
        LocalDateTime after2 = LocalDateTime.now();

        System.out.println("clone: "+Duration.between(before2, after2).toNanos());

    }
}
