package indi.yunherry.model.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author YunHerry
 * 保存解析器解析后获取到的数据
 */
public class ResolveResult {
    private String methodName;
    private final Map<String, Object> methodArgs = new HashMap<>();
    private final Map<String, List<Class<?>>> typeArgs = new HashMap<>();

    public ResolveResult(String methodName) {
        this.methodName = methodName;
    }

    public ResolveResult(Map<String, String> methodArgs) {
        this.methodArgs.putAll(methodArgs);
    }

    public Map<String, Object> getMethodArgs() {
        return methodArgs;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    @Override
    public String toString() {
        return "Method: " + this.methodName + " args: " + methodArgs;
    }

    public Map<String, List<Class<?>>> getTypeArgs() {
        return typeArgs;
    }

    public boolean setTypeArgs(String key, List<Class<?>> typeArgs) {
        this.typeArgs.put(key, typeArgs);
        return true;
    }
}

