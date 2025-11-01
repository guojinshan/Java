import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

public class AOPUtils {

    private final static String UNKNOWN_METHOD = "UnknownMethod";

    /**
     * 获取函数名称
     *
     * @param point     切点信息
     * @param signature 函数签名
     * @return 函数需要打印的名称
     */
    public static String getMethodName(ProceedingJoinPoint point, MethodSignature signature) {
        if (signature == null) {
            return UNKNOWN_METHOD;
        }

        String methodName = signature.getName();
        String clsName = point.getTarget().getClass().getSimpleName();
        return clsName + "#" + methodName;
    }

}
