package cn.util;

import sun.misc.BASE64Decoder;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class GenerateImage {
    /**
     2      * 字符串转图片
     3      * @param imgStr --->图片字符串
     4      * @param filename    --->图片名
     5      * @return
     6      */
      public static boolean generateImage(String imgStr, String filename) {

                 if (imgStr == null) {
                         return false;
                     }
                 BASE64Decoder decoder = new BASE64Decoder();
                 try {
                         // 解密
                         byte[] b = decoder.decodeBuffer(imgStr);
                         // 处理数据
                         for(int i = 0; i < b.length; ++i) {
                                 if (b[i] < 0) {
                                         b[i] += 256;
                                     }
                             }
                         OutputStream out = new FileOutputStream("D:/Systems/"+filename);
                         out.write(b);
                         out.flush();
                         out.close();
                         return true;
                     } catch (IOException e) {
                         e.printStackTrace();
                     }
                 return false;
        }
    }
