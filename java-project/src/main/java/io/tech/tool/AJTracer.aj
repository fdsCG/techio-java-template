package io.tech.tool;

import java.util.HashMap;
import java.util.Map;
import io.tech.tool.Tracer;

public aspect AJTracer {

    pointcut methods() : ( cflow(call(* *(..))) && !within(AJTracer) && !within(io.tech..*) );

    before(): methods() {
        if (Tracer.map.isEmpty()) return;

        String signature = thisJoinPointStaticPart.getSignature().toString();

        System.out.println("----> "+ signature);
        
        Method cb = Tracer.getMethod(signature);
        if (cb != null) {
            cb.target = thisJoinPoint.getTarget();
            cb.args = thisJoinPoint.getArgs();
            cb.called = true;
        }
    }
}