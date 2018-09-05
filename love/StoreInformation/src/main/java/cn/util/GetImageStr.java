package cn.util;

import sun.misc.BASE64Encoder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class GetImageStr {
    /**
           * 图片转字符串
           * @param filePath    --->文件路径
           * @return
           */
     public static String getImageStr(String filePath) {
                 InputStream inputStream = null;
                 byte[] data = null;
                 try {
                         inputStream = new FileInputStream(filePath);
                         data = new byte[inputStream.available()];
                         inputStream.read(data);
                         inputStream.close();
                     } catch (IOException e) {
                         e.printStackTrace();
                     }
                 // 加密
                 BASE64Encoder encoder = new BASE64Encoder();
                 return encoder.encode(data);
             }

}
