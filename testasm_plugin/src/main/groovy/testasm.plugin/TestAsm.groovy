package testasm.plugin

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

public class TestAsm implements Plugin<Project>{
    @Override
    void apply(Project project) {
        System.out.println("==plugin gradle plugin==")
        def type = project.extensions.getByType(AppExtension)
        System.out.println("==registering AutoTrackTransform==")
        TestAsmTransform transform=new TestAsmTransform()
        type.registerTransform(transform)
    }
}