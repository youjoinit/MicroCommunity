package com.java110.vo.api.machine;

import java.io.Serializable;
import java.util.Date;

public class ApiMachineDataVo implements Serializable {

    private String machineId;
private String machineCode;
private String machineVersion;
private String machineName;
private String machineTypeCd;
private String authCode;
private String machineIp;
private String machineMac;
public String getMachineId() {
        return machineId;
    }
public void setMachineId(String machineId) {
        this.machineId = machineId;
    }
public String getMachineCode() {
        return machineCode;
    }
public void setMachineCode(String machineCode) {
        this.machineCode = machineCode;
    }
public String getMachineVersion() {
        return machineVersion;
    }
public void setMachineVersion(String machineVersion) {
        this.machineVersion = machineVersion;
    }
public String getMachineName() {
        return machineName;
    }
public void setMachineName(String machineName) {
        this.machineName = machineName;
    }
public String getMachineTypeCd() {
        return machineTypeCd;
    }
public void setMachineTypeCd(String machineTypeCd) {
        this.machineTypeCd = machineTypeCd;
    }
public String getAuthCode() {
        return authCode;
    }
public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }
public String getMachineIp() {
        return machineIp;
    }
public void setMachineIp(String machineIp) {
        this.machineIp = machineIp;
    }
public String getMachineMac() {
        return machineMac;
    }
public void setMachineMac(String machineMac) {
        this.machineMac = machineMac;
    }



}
