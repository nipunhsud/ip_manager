package com.ipmanager.captcha

import j.antigate.CapchaUtils

import org.jsoup.Jsoup
import org.jsoup.nodes.Document


class CaptchaController{
    def index() { }
	def scraperService
	def captchaSolver(){
		
		scraperService.getCaptcha()
//		String answer;
//		log.info("Testing")
//		try { /** Just get an InputStream of your image in any way you want. In the example I use a local File **/
//			File f = new File("./data/CaptchaImage.jpeg"); 
//			InputStream is = new FileInputStream(f);
//			//** You may check your antigate.com balance first **/
//			String balance = CapchaUtils.getBalance("e28710623632f4a88433aa482e2c1a79");
//			log.info("Balance "+ balance);
//			/** Use CapchaAnswer() method to get the capcha text, returns error message if any **/
//			
//			Document doc = Jsoup.connect("http://164.100.176.37/eregister/eregister.aspx").get();
//			String title = doc.title();
//			log.info(title);
//			//answer = CapchaBypass.CapchaAnswer(is, "e28710623632f4a88433aa482e2c1a79", "no", "no", "no");
//		} catch (IOException | InterruptedException e) { e.printStackTrace(); }
//		//log.info("Answer "+ answer);
		render(status:200, text: "Success" , contextType: "application/json")
	}
}
