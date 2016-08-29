class UrlMappings {

	static mappings = {
//        "/$controller/$action?/$id?(.$format)?"{
//            constraints {
//                // apply constraints here
//            }
//        }
		
		"/captcha/test"{
			controller = "captcha"
			action = "captchaSolver"
			method = "GET"
		}
		

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
