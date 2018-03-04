package com.xg.bysj.domain;import java.io.Serializable;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

/**
 * @Author: huang
 * @Description: 教研室
 * @Date: Created in 13:40 2018-01-30  .
 * @Modified by:
 */

@javax.persistence.Entity
public class Department extends BasicEntity  implements Serializable{

    /*学院*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private School school;

    public Department() {
        super();
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}

