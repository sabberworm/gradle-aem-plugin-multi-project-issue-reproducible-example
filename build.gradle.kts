plugins {
	id("com.cognifide.aem.package")
}

repositories {
	jcenter()
}

aem {
	tasks {
		packageCompose {
			mergePackageProject(":package")

		}
	}
}
