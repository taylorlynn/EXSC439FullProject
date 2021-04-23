/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.blog.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.blog.BlogRuntimeModule;
import org.xtext.example.blog.BlogStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class BlogIdeSetup extends BlogStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new BlogRuntimeModule(), new BlogIdeModule()));
	}
	
}
