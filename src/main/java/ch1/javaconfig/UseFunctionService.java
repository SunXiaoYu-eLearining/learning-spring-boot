package ch1.javaconfig;

public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService){
        this.functionService = functionService;
    }

    public String SayHello(String msg){
        return functionService.sayHello(msg);
    }
}
