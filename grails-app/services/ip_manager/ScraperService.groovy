package ip_manager

import grails.transaction.Transactional

import com.gargoylesoftware.htmlunit.Page
import com.gargoylesoftware.htmlunit.ScriptResult
import com.gargoylesoftware.htmlunit.WebClient
import com.gargoylesoftware.htmlunit.html.HtmlAnchor
import com.gargoylesoftware.htmlunit.html.HtmlInput
import com.gargoylesoftware.htmlunit.html.HtmlPage
import com.gargoylesoftware.htmlunit.html.HtmlTable
import com.gargoylesoftware.htmlunit.html.HtmlTableRow

@Transactional
class ScraperService {

    def getCaptcha(){
		final WebClient webClient = new WebClient();
		webClient.waitForBackgroundJavaScriptStartingBefore(10000);
		final HtmlPage page = webClient.getPage("http://164.100.176.37/eregister/eregister.aspx");
		final HtmlPage packagePage = (HtmlPage) page.getFrameByName("eregoptions").getEnclosedPage();
		println "Package page "+ packagePage
		final HtmlTable table = packagePage.getHtmlElementById("web-buttons-idgsuam");
		//println "Table " + table
		
		final HtmlTableRow row = table.getRows().get(0);
		//println "table.getRows().get(0) "+ row
		HtmlAnchor htmlAnchor = packagePage.getAnchorByHref("viewdetails_new.aspx");
		
		HtmlPage page3 = htmlAnchor.click();
		println "Html page after click "+ page3
		
		//HtmlRadioButtonInput radioButton = (HtmlRadioButtonInput) page3.getElementById("rdb_0");
		//HtmlPage captchaPage = radioButton.setChecked(true);
		
		 String onclickAttr = page3.getElementById("rdb_0").getOnClickAttribute();
		 println "getOnClickAttribute "+ onclickAttr
		 ScriptResult result = page.executeJavaScript(onclickAttr);
		 Page resultPage = result.getNewPage();
//		HtmlPage captchaPage = input.click()
		println "Final Page "+ resultPage
	}
}
