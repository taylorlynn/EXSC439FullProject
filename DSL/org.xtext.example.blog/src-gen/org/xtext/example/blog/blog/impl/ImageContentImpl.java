/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.blog.blog.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.blog.blog.BlogPackage;
import org.xtext.example.blog.blog.Image;
import org.xtext.example.blog.blog.ImageContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.blog.blog.impl.ImageContentImpl#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageContentImpl extends SectionContentImpl implements ImageContent
{
  /**
   * The cached value of the '{@link #getImage() <em>Image</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImage()
   * @generated
   * @ordered
   */
  protected Image image;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImageContentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BlogPackage.Literals.IMAGE_CONTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Image getImage()
  {
    if (image != null && image.eIsProxy())
    {
      InternalEObject oldImage = (InternalEObject)image;
      image = (Image)eResolveProxy(oldImage);
      if (image != oldImage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BlogPackage.IMAGE_CONTENT__IMAGE, oldImage, image));
      }
    }
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Image basicGetImage()
  {
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setImage(Image newImage)
  {
    Image oldImage = image;
    image = newImage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BlogPackage.IMAGE_CONTENT__IMAGE, oldImage, image));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BlogPackage.IMAGE_CONTENT__IMAGE:
        if (resolve) return getImage();
        return basicGetImage();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BlogPackage.IMAGE_CONTENT__IMAGE:
        setImage((Image)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BlogPackage.IMAGE_CONTENT__IMAGE:
        setImage((Image)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BlogPackage.IMAGE_CONTENT__IMAGE:
        return image != null;
    }
    return super.eIsSet(featureID);
  }

} //ImageContentImpl
