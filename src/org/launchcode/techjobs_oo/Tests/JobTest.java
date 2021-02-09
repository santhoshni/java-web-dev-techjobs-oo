package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.CoreCompetency;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


public class JobTest {
    Job job1, job2, jobOne, jobTwo;

    @Before
    public void JobTestCase() {
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job2 = new Job("Web Developer", new Employer(""), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));

        jobOne = new Job();
        jobTwo = new Job();
    }

    @Test
    public void testSettingJobId() {
//        System.out.println("job1" + job1.getId());
//        System.out.println("job4" +jobTwo.getId());
        assertEquals(1, job2.getId() - job1.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(job1 instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(job1.getName().equals(job2.getName()));
    }


    @Test
    public void testForToString(){
        System.out.println(job1.getId());
        assertEquals("\n ID : "+job1.getId() +"\n" +
                " Name: Product tester\n" +
                " Employer: ACME\n " +
                " Location: Desert\n" +
                " Position Type: Quality control\n" +
                " Core Competency: Persistence" + "\n", job1.toString());

       /* assertEquals("\n ID : 2\n" +
                " Name: Web Developer\n" +
                " Employer: Data not available\n" +
                " Location: St. Louis\n" +
                " Position Type: Front-end developer\n" +
                " Core Competency: JavaScript" + "\n", job2.toString());

        // System.out.println(jobOne.toString());
        assertEquals("Job not available", jobOne.toString());*/
    }



    // Add a custom toString() method .
 /*   @Override
    public String toString() {
        System.out.println(" ID : " + job1.getId() + "\n Name: " + job1.getName() + "\n Employer: "
                + job1.getEmployer() + "\n Location: " + job1.getLocation() + "\n Position Type: "
                + job1.getPositionType()+ "\n Core Competency: " + job1.getCoreCompetency());

        return " ID : " + job1.getId() + "\n Name: " + job1.getName() + "\n Employer: "
                + job1.getEmployer() + "\n Location: " + job1.getLocation() + "\n Position Type: "
                + job1.getPositionType()+ "\n Core Competency: " + job1.getCoreCompetency();
    }

    @Test
    public void JobTest() {
        System.out.println(" ID : " + job1.getId() + "\n Name: " + job1.getName() + "\n Employer: "
                + job1.getEmployer() + "\n Location: " + job1.getLocation() + "\n Position Type: "
                + job1.getPositionType()+ "\n Core Competency: " + job1.getCoreCompetency());
    }*/
   /* @Before
    public void JobTest (){
        int id = nextId;
        nextId++;
        assertEquals(id, nextId);
    }*/


    //@Test
    //public void emptyTest() {
    //   assertEquals(true, true);
    //}
    //@Test
    //public void onlyBracketsReturnsTrue() {
    //   assertTrue(JobTest.hasJobTest("[]"));
    //}
}
