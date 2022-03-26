package com.GradedAssesment.sevices;
import com.GradedAssesment.model.AdminDepartment;
import com.GradedAssesment.model.HrDepartment;
import com.GradedAssesment.model.TechDepartment;

public class driver {

    public HrDepartment objHr;
    public AdminDepartment objAdmin;
    public TechDepartment objTech;
    public driver() {
        this.objAdmin = new AdminDepartment();
        this.objHr = new HrDepartment();
        this.objTech = new TechDepartment();
    }

    
}
