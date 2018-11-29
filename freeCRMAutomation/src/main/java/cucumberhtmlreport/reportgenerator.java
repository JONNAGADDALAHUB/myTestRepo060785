package cucumberhtmlreport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class reportgenerator {
	
	public static void main(String[] args) {
		List<String> jsonfiles = new ArrayList<String>();
		
		File folder = new File(args[0].trim());
		File[] lstfiles = folder.listFiles();
		for(File fl : lstfiles) {
			if (fl.isFile()) {
				jsonfiles.add(fl.getPath());
								
			}
		}
		
		String jenkinsBasePath = "";
		String buildNumber = "1";
		String projectName = "Free CRM Automation";
		boolean runWithJenkins = false;
		boolean parallelTesting = false;
		boolean skippedFails = false;
		boolean pendingFails = false;
		boolean undefinedFails = false;
		
		File reportOutputDirectory = new File(args[1].trim());	
		
		/*System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(args[0].trim());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");*/
		Configuration configs = new Configuration(reportOutputDirectory, projectName);
		// optional configuration
		configs.setParallelTesting(parallelTesting);
		configs.setRunWithJenkins(runWithJenkins);
		configs.setBuildNumber(buildNumber);
		System.out.println("Generating Cucumber Report");
		ReportBuilder reportBuilder = new ReportBuilder(jsonfiles, configs);
		reportBuilder.generateReports();	
		
	}

}
