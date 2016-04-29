package app;
import org.apache.jmeter.config.Arguments;   
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;   
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;   
import org.apache.jmeter.samplers.SampleResult;   
 
public class TestLength extends AbstractJavaSamplerClient {           
        private static long start = 0;   
        private static long end = 0;       
        public void setupTest(JavaSamplerContext arg0) {   
                // 开始时间   
                start = System.currentTimeMillis();   
        }   
        public void teardownTest(JavaSamplerContext arg0) {   
                // 结束时间   
                end = System.currentTimeMillis();   
                // 总体耗时   
                System.err.println("cost time:" + (end - start) / 1000);   
        }   
        public Arguments getDefaultParameters() {   
                Arguments args = new Arguments();   
                return args;   
        }       
        @Override  
        public SampleResult runTest(JavaSamplerContext arg0) {   
                SampleResult sr = new SampleResult();   
                try {   
                        // Start   
                        sr.sampleStart();                           
                        // TODO                              
                        sr.setSuccessful(true);   
                        // End   
                        sr.sampleEnd();   
                } catch (Exception e) {   
                        e.printStackTrace();   
                }   
                return sr;   
        }
}
   