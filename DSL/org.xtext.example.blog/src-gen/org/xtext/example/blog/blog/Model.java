/**
 * generated by Xtext 2.24.0
 */
package org.xtext.example.blog.blog;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.blog.blog.Model#getImages <em>Images</em>}</li>
 *   <li>{@link org.xtext.example.blog.blog.Model#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.xtext.example.blog.blog.Model#getSite <em>Site</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.blog.blog.BlogPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Images</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.blog.blog.Image}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Images</em>' containment reference list.
   * @see org.xtext.example.blog.blog.BlogPackage#getModel_Images()
   * @model containment="true"
   * @generated
   */
  EList<Image> getImages();

  /**
   * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.blog.blog.Category}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Categories</em>' containment reference list.
   * @see org.xtext.example.blog.blog.BlogPackage#getModel_Categories()
   * @model containment="true"
   * @generated
   */
  EList<Category> getCategories();

  /**
   * Returns the value of the '<em><b>Site</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Site</em>' containment reference.
   * @see #setSite(Site)
   * @see org.xtext.example.blog.blog.BlogPackage#getModel_Site()
   * @model containment="true"
   * @generated
   */
  Site getSite();

  /**
   * Sets the value of the '{@link org.xtext.example.blog.blog.Model#getSite <em>Site</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Site</em>' containment reference.
   * @see #getSite()
   * @generated
   */
  void setSite(Site value);

} // Model
