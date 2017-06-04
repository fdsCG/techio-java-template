package io.tech.tool;

import java.util.HashMap;
import java.util.Map;
import io.tech.tool.Tracer;

public aspect AJTracer {

    pointcut methods() : ( cflow(call(* *(..))) && !within(io.tech..*) );

    before(): methods() {

        String signature = thisJoinPointStaticPart.getSignature().toString();

        System.out.println("----> "+ signature);

        if (Tracer.map.isEmpty()) return;

        
        Method cb = Tracer.map.get(signature);
        if (cb != null) {
            cb.target = thisJoinPoint.getTarget();
            cb.args = thisJoinPoint.getArgs();
            cb.called = true;
        }
    }
}