/*
 * generated by Xtext 2.24.0
 */
package org.xtext.example.blog.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.blog.ui.internal.BlogActivator;

public class BlogUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return BlogActivator.getInstance().getInjector("org.xtext.example.blog.Blog");
	}

}
