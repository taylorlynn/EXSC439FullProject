package org.xtext.example.blog.validation

import org.eclipse.xtext.validation.Check
import org.xtext.example.blog.blog.Page
import org.xtext.example.blog.blog.BlogPackage
import org.xtext.example.blog.blog.Site
import org.xtext.example.blog.blog.Image
import java.net.URL

class BlogValidator extends AbstractBlogValidator {
	
	@Check
	def void chceckPageNameUnique(Page page){
		
		var site = (page.eContainer() as Site);
		
		if (site !== null) {
			
			for (page2 : site.getPages()) {
				if (page2 instanceof Page && !page2.equals(page) && page2.getName().equals(page.getName())) {
					error("Page names have to be unique in a model", BlogPackage.Literals.PAGE__NAME);
					return;
				
				}
				
			}
			
		}
			
	}
	
	@Check
	def void checkImageIsUrl(Image image) {
		
		try {
			new URL(image.getUrl());
		} catch (Exception e) {
			error("Image URL must be a valid URL", BlogPackage.Literals.IMAGE__URL);
			return;
		}
	}
	
	@Check
	def void checkIconIsUrl(Site site) {
		
		try {
			new URL(site.getIconUrl());
		} catch (Exception e) {
			error("ICON URL must be a valid URL", BlogPackage.Literals.SITE__ICON_URL);
			return;
		}
	}
	
}