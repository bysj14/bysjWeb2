package com.xg.bysj.domain;import java.io.Serializable;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

/**
 * @Author: huang
 * @Description: 班级
 * @Date: Created in 15:00 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class StudentClass extends BasicEntity  implements Serializable{

    /*专业*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Major major;


    public StudentClass() {
        super();
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }
}

