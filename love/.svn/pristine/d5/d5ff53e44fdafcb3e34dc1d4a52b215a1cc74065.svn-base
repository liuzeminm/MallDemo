package cn.util.encryption;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Md5 {
    public static final String KEY_MD5 = "MD5";


    public static  String  getResult(String inputStr)
    {
        BigInteger bigInteger=null;

        try {
            MessageDigest md = MessageDigest.getInstance(KEY_MD5);
            byte[] inputData = inputStr.getBytes();
            md.update(inputData);
            bigInteger = new BigInteger(md.digest());
        } catch (Exception e) {e.printStackTrace();}
        return bigInteger.toString(16);
    }

    public static void main(String args[])
    {
        try {
            String inputStr = "[[1,2],[1,2],[1,2],[1,2],[1,2]]";
            String result = getResult(inputStr);
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
