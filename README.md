# JavaTDD
Test driven development using Unit

JUnit4 Annotations:
@Test: The Test annotation tells JUnit that the public void method to which it is attached can be run as a test case.
@Ignore: Disable a test or a group of tests.
@Before: Runs before each test in the class. When writing tests, it is common to find that several tests need similar objects created before they can run.
@After: Runs after each test in this class. If you allocate external resources in a Before method you need to release them after the test runs.
@BeforeClass: Runs one time before any test in the class. Sometimes several tests need to share computationally expensive setup (like logging into a database).
@AfterClass: Runs one time After each test in the class. If you allocate expensive external resources in a BeforeClass method you need to release them after all the tests in the class have run.
