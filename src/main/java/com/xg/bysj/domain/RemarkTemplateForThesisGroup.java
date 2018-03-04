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
 * @Description: 论文类类课题答辩小组意见表评语模板
 * @Date: Created in 14:50 2018-01-30  .
 * @Modified by:
 */
@Entity
@DiscriminatorValue("RemarkTemplateForThesisGroup")
public class RemarkTemplateForThesisGroup extends RemarkTemplate implements Serializable
{

	public RemarkTemplateForThesisGroup(){
		super();
	}

	public String getCategory() {
		// TODO : to implement
		return "";
	}

}

