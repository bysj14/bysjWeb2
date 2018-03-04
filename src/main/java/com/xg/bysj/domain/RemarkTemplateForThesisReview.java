package com.xg.bysj.domain;import java.io.Serializable;



import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

/**
 * @Author: huang
 * @Description: 论文类课题评阅人评审表评语模板
 * @Date: Created in 14:51 2018-01-30  .
 * @Modified by:
 */
@Entity
@DiscriminatorValue("RemarkTemplateForThesisReview")
public class RemarkTemplateForThesisReview extends RemarkTemplate implements Serializable
{

	public RemarkTemplateForThesisReview(){
		super();
	}

	 
	public String getCategory() {
		// TODO : to implement
		return "";
	}

}

