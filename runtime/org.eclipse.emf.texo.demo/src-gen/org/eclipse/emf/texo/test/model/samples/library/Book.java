package org.eclipse.emf.texo.test.model.samples.library;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import org.eclipse.emf.texo.test.model.base.identifiable.Identifiable;
import org.eclipse.emf.texo.test.models.annotations.TestAnnotationOne;
import org.eclipse.emf.texo.test.models.annotations.TestAnnotationTwo;

/**
 * A representation of the model object '<em><b>Book</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity(name = "library_Book")
@TestAnnotationOne("test")
public class Book extends Identifiable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@TestAnnotationOne("field")
	@TestAnnotationTwo("field")
	@Basic()
	private String title = "TEST";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@TestAnnotationOne("test")
	@Basic()
	private int pages = 100;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@TestAnnotationOne("test")
	@Basic()
	@Enumerated(EnumType.STRING)
	private BookCategory category = BookCategory.SCIENCEFICTION;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@TestAnnotationOne("test")
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, optional = false)
	@JoinColumns({ @JoinColumn() })
	private Writer author = null;

	/**
	 * Returns the value of '<em><b>title</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>title</b></em>' feature
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the '{@link Book#getTitle() <em>title</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTitle
	 *            the new value of the '{@link Book#getTitle() title}' feature.
	 * @generated
	 */
	public void setTitle(String newTitle) {
		title = newTitle;
	}

	/**
	 * Returns the value of '<em><b>pages</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>pages</b></em>' feature
	 * @generated
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * Sets the '{@link Book#getPages() <em>pages</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newPages
	 *            the new value of the '{@link Book#getPages() pages}' feature.
	 * @generated
	 */
	public void setPages(int newPages) {
		pages = newPages;
	}

	/**
	 * Returns the value of '<em><b>category</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>category</b></em>' feature
	 * @generated
	 */
	public BookCategory getCategory() {
		return category;
	}

	/**
	 * Sets the '{@link Book#getCategory() <em>category</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCategory
	 *            the new value of the '{@link Book#getCategory() category}'
	 *            feature.
	 * @generated
	 */
	public void setCategory(BookCategory newCategory) {
		category = newCategory;
	}

	/**
	 * Returns the value of '<em><b>author</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>author</b></em>' feature
	 * @generated
	 */
	public Writer getAuthor() {
		return author;
	}

	/**
	 * Sets the '{@link Book#getAuthor() <em>author</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newAuthor
	 *            the new value of the '{@link Book#getAuthor() author}'
	 *            feature.
	 * @generated
	 */
	public void setAuthor(Writer newAuthor) {
		author = newAuthor;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Book " + " [title: " + getTitle() + "]" + " [pages: "
				+ getPages() + "]" + " [category: " + getCategory() + "]";
	}
}
