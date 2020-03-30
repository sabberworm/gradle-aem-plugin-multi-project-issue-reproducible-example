plugins {
	id("com.cognifide.aem.package")
}

repositories {
	jcenter()
}

aem {
	tasks {
		packageCompose {
			doFirst {
				Thread.sleep(10 * 1000)
			}
			nestPackage("com.adobe.cq:core.wcm.components.all:2.8.0")

		}
	}
}
