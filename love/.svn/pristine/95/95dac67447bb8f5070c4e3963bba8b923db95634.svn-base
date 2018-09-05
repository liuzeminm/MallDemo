package cn.util.httpApiDemo;

import java.net.URLEncoder;
import java.util.Random;

/**
 * 验证码通知短信接口
 * 
 * @ClassName: IndustrySMS
 * @Description: 验证码通知短信接口
 *
 */
public class IndustrySMS
{
	private static String operation = "/industrySMS/sendSMS";

	private static String accountSid = Config.ACCOUNT_SID;
	private static String smsContent = "您的验证码为{1}，请于2分钟内正确输入，如非本人操作，请忽略此短信。";
	private static String templateid= "525789374";
	private static String param = new Random().nextInt(1000000)+"";
	public static String yanZheng = param;

	/**
	 * 验证码通知短信
	 */
	public static String execute(String to)
	{
		String tmpSmsContent = null;
		try{
			tmpSmsContent = URLEncoder.encode(templateid, "UTF-8");
		}catch(Exception e){

		}
		String url = Config.BASE_URL + operation;
		String body = "accountSid=" + accountSid + "&to=" + to + "&templateid="+ templateid+HttpUtil.createCommonParam() +
				"&param="+yanZheng ;

		// 提交请求
		String result = HttpUtil.post(url, body);
		System.out.println("result:" + System.lineSeparator() + result);
		return yanZheng;
	}
}
