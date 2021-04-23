package org.xtext.example.blog.validation;

import java.net.URL;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.example.blog.blog.BlogPackage;
import org.xtext.example.blog.blog.Image;
import org.xtext.example.blog.blog.Page;
import org.xtext.example.blog.blog.Site;
import org.xtext.example.blog.validation.AbstractBlogValidator;

@SuppressWarnings("all")
public class BlogValidator extends AbstractBlogValidator {
  @Check
  public void chceckPageNameUnique(final Page page) {
    EObject _eContainer = page.eContainer();
    Site site = ((Site) _eContainer);
    if ((site != null)) {
      EList<Page> _pages = site.getPages();
      for (final Page page2 : _pages) {
        if ((((page2 instanceof Page) && (!page2.equals(page))) && page2.getName().equals(page.getName()))) {
          this.error("Page names have to be unique in a model", BlogPackage.Literals.PAGE__NAME);
          return;
        }
      }
    }
  }
  
  @Check
  public void checkImageIsUrl(final Image image) {
    try {
      String _url = image.getUrl();
      new URL(_url);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        this.error("Image URL must be a valid URL", BlogPackage.Literals.IMAGE__URL);
        return;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Check
  public void checkIconIsUrl(final Site site) {
    try {
      String _iconUrl = site.getIconUrl();
      new URL(_iconUrl);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        this.error("ICON URL must be a valid URL", BlogPackage.Literals.SITE__ICON_URL);
        return;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
