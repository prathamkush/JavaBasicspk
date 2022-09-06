package com.package1;

import com.package2.checkAccess3;

class checkinAccessSamePackage {
    public static void main(String[] args){
        checkAccess3 obj = new checkAccess3();
        obj.displayPackage2();
    }
}
