/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cabolabs.openehr.archetypes.ArchetypeManager

/**
 * @author pab
 *
 */
class ArchetypeManagerTest {

   private static String PS = File.separator
   private static String path = "."+ PS +"src"+ PS +"test"+ PS +"archetypes"
   
   /**
    * @throws java.lang.Exception
    */
   @BeforeClass
   public static void setUpBeforeClass() throws Exception
   {
   }

   /**
    * @throws java.lang.Exception
    */
   @AfterClass
   public static void tearDownAfterClass() throws Exception
   {
   }

   /**
    * @throws java.lang.Exception
    */
   @Before
   public void setUp() throws Exception
   {
      //def f = new File(".")
      //println "Current folder: "+ f.getCanonicalPath()
   }

   /**
    * @throws java.lang.Exception
    */
   @After
   public void tearDown() throws Exception
   {
   }

   /**
    * Test method for {@link com.cabolabs.openehr.archetypes.ArchetypeManager#ArchetypeManager(java.lang.String)}.
    */
   @Test
   public void testArchetypeManager()
   {
      //def loader = ArchetypeManager.getInstance(path)
      //def archetype = loader.getArchetype("openEHR-EHR-INSTRUCTION.test_ordenes.v1")
   }

   /**
    * Test method for {@link com.cabolabs.openehr.archetypes.ArchetypeManager#getInstance(java.lang.String)}.
    */
   @Test
   public void testGetInstance()
   {
      def loader = ArchetypeManager.getInstance(path)
      assert loader != null : "getInstance is returning null"
   }

   /**
    * Test method for {@link com.cabolabs.openehr.archetypes.ArchetypeManager#loadAll()}.
    */
   @Test
   public void testLoadAll()
   {
      def loader = ArchetypeManager.getInstance(path)
      loader.loadAll()
      assert loader.getArchetypes("composition", ".*").size() == 3 : "No se cargaron todos los arquetipos"
      assert loader.getArchetypes("observation", ".*").size() == 7 : "No se cargaron todos los arquetipos"
   }

   /**
    * Test method for {@link com.cabolabs.openehr.archetypes.ArchetypeManager#getArchetype(java.lang.String)}.
    */
   @Test
   public void testGetArchetypeString()
   {
      fail("Not yet implemented");
   }

   /**
    * Test method for {@link com.cabolabs.openehr.archetypes.ArchetypeManager#getArchetype(java.lang.String, java.lang.String)}.
    */
   @Test
   public void testGetArchetypeStringString()
   {
      fail("Not yet implemented");
   }

   /**
    * Test method for {@link com.cabolabs.openehr.archetypes.ArchetypeManager#getArchetypes(java.lang.String, java.lang.String)}.
    */
   @Test
   public void testGetArchetypes()
   {
      fail("Not yet implemented");
   }

   /**
    * Test method for {@link com.cabolabs.openehr.archetypes.ArchetypeManager#getArchetypeNode(java.lang.String)}.
    */
   @Test
   public void testGetArchetypeNode()
   {
      fail("Not yet implemented");
   }

   /**
    * Test method for {@link com.cabolabs.openehr.archetypes.ArchetypeManager#toString()}.
    */
   @Test
   public void testToString()
   {
      fail("Not yet implemented");
   }

   /**
    * Test method for {@link com.cabolabs.openehr.archetypes.ArchetypeManager#getLoadedArchetypes()}.
    */
   @Test
   public void testGetLoadedArchetypes()
   {
      fail("Not yet implemented");
   }

   /**
    * Test method for {@link com.cabolabs.openehr.archetypes.ArchetypeManager#getLastUse()}.
    */
   @Test
   public void testGetLastUse()
   {
      fail("Not yet implemented");
   }

   /**
    * Test method for {@link com.cabolabs.openehr.archetypes.ArchetypeManager#unloadAll()}.
    */
   @Test
   public void testUnloadAll()
   {
      fail("Not yet implemented");
   }

   /**
    * Test method for {@link com.cabolabs.openehr.archetypes.ArchetypeManager#findArchetypeIds(java.lang.String)}.
    */
   @Test
   public void testFindArchetypeIds()
   {
      fail("Not yet implemented");
   }

}
