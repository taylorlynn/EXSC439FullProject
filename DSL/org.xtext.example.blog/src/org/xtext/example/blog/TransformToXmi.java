package org.xtext.example.blog;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

//This code is taken from the stack overflow link provided by the professor
public class TransformToXmi {

	public static void main(String[] args) throws Exception {
		
		String filepath = "/Users/taylorlynncurtis/Desktop/ECSE539/ECSEProject/runtime-EclipseXtext/TestModels";
		String sourceFilename = "model3.blog";
		String targetFilename = "model3.xmi";
		
		exportXMI(filepath, sourceFilename, targetFilename);

	}
	
	private static void exportXMI(String absuloteTargetFolderPath, String source, String target) {
	    // change MyLanguage with your language name
	    Injector injector = new BlogStandaloneSetup()
	            .createInjectorAndDoEMFRegistration();
	    XtextResourceSet resourceSet = injector
	            .getInstance(XtextResourceSet.class);

	    // .ext ist the extension of the model file
	    String inputURI = "file:///" + absuloteTargetFolderPath + "/" + source;
	    String outputURI = "file:///" + absuloteTargetFolderPath + "/" + target;
	    URI uri = URI.createURI(inputURI);
	    Resource xtextResource = resourceSet.getResource(uri, true);

	    EcoreUtil.resolveAll(xtextResource);

	    Resource xmiResource = resourceSet
	            .createResource(URI.createURI(outputURI));
	    xmiResource.getContents().add(xtextResource.getContents().get(0));
	    try {
	        xmiResource.save(null);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}
