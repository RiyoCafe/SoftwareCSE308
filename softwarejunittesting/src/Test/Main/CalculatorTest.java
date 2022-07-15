package Main;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing...........")
class CalculatorTest {
    @BeforeAll
    static void startMethod()
    {
        System.out.println("Started");
    }
    @AfterAll
    static void afterMethod()
    {
        System.out.println("Finished");
    }
    @org.junit.jupiter.api.Nested
    @DisplayName("will start 3 credit tests....")
    class Grade3CreditTest {
        @BeforeAll
        static void startMethod() {
            System.out.println("Started 3 credit tests");
        }

        @AfterAll
        static void afterMethod() {
            System.out.println("Finished 3 credit tests");
        }


        static Credit3MarksCalculation calculation;

        @BeforeAll
        static void StartProgram() {
            calculation = new Credit3MarksCalculation();
        }

        @Test
        @DisplayName("Testing Negetive Mark")
        void NegativeMarkChecking() {
            Exception exception = assertThrows(Exception.class, () -> {
                calculation.gardeCalculation(TESTINGNames.NOT_IN_RANGE_EXTRA);
            });
            if (exception != null) {
                String detected = exception.getMessage();
                String actual = "Given input is not in range";
                assertEquals(actual, detected);
            } else {
                fail();
            }
        }

        @Test
        @DisplayName("Testing Extra Mark")
        void ExtraNotRangeMarkChecking() {
            Exception exception = assertThrows(Exception.class, () -> {
                calculation.gardeCalculation(TESTINGNames.NOT_IN_RANGE_NEG);
            });
            if (exception != null) {
                String detected = exception.getMessage();
                String actual = "Given input is not in range";
                assertEquals(actual, detected);
            } else {
                fail();
            }
        }

        @Test
        @DisplayName("NON NUMBER MARKS")
        void NonNumberMarksChecking() {
            Exception exception = assertThrows(Exception.class, () -> {
                calculation.gardeCalculation(TESTINGNames.NON_NUMBER_MARK);
            });
            if (exception != null) {
                String detected = exception.getMessage();
                String actual = "Given Input is not a number";
                assertEquals(actual, detected);
            } else {
                fail();
            }
        }

        @Test
        @DisplayName("MARKS_NEG_LOWER_BOUND CHECK")
        void NEG_NumberLOWER_BOUND_MarksChecking() {
            Exception exception = assertThrows(Exception.class, () -> {
                calculation.gardeCalculation(TESTINGNames.MARKS_NEG_LOWER_BOUND);
            });
            if (exception != null) {
                String detected = exception.getMessage();
                String actual = "Given input is not in range";
                assertEquals(actual, detected);
            } else {
                fail();
            }
        }

        @Test
        @DisplayName("MARKS_POS_BOUNDARY_MAX TESTING")
        void POS_max_boundary_marks() {
            Exception exception = assertThrows(Exception.class, () -> {
                calculation.gardeCalculation(TESTINGNames.MARKS_POS_BOUNDARY_MAX);
            });
            if (exception != null) {
                String detected = exception.getMessage();
                String actual = "Given input is not in range";
                assertEquals(actual, detected);
            } else {
                fail();
            }
        }

        @Test
        @DisplayName("GRADE A CHECKING")
        void checkingGradeA() {
            try {
                char accept = calculation.gardeCalculation(TESTINGNames.GRADE_A);
                assertEquals('A', accept);
            } catch (Exception e) {
                fail();
            }
        }

        @Test
        @DisplayName("GRADE B CHECKING")
        void checkingGradeB() {
            try {
                char accept = calculation.gardeCalculation(TESTINGNames.GRADE_B);
                assertEquals('B', accept);
            } catch (Exception e) {
                fail();
            }
        }

        @Test
        @DisplayName("GRADE C CHECKING")
        void checkingGradeC() {
            try {
                char accept = calculation.gardeCalculation(TESTINGNames.GRADE_C);
                assertEquals('C', accept);
            } catch (Exception e) {
                fail();
            }
        }

        @Test
        @DisplayName("FAIL CHECKING")
        void checkingFail() {
            try {
                char accept = calculation.gardeCalculation(TESTINGNames.FAIL_MARK);
                assertEquals('F', accept);
            } catch (Exception e) {
                fail();
            }
        }

        @Test
        @DisplayName("GRADE A LOWER BOUND")
        void checkingGradeAlowerBound() {
            try {
                char accept = calculation.gardeCalculation(TESTINGNames.GRADE_A_LOWER_BOUND);
                assertEquals('A', accept);
            } catch (Exception e) {
                fail();
            }
        }

        @Test
        @DisplayName("GRADE B LOWER BOUND")
        void checkingGradeBlowerBound() {
            try {
                char accept = calculation.gardeCalculation(TESTINGNames.GRADE_B_LOWER_BOUND);
                assertEquals('B', accept);
            } catch (Exception e) {
                fail();
            }
        }

        @Test
        @DisplayName("GRADE C LOWER BOUND")
        void checkingGradeClowerBound() {
            try {
                char accept = calculation.gardeCalculation(TESTINGNames.GRADE_C_LOWER_BOUND);
                assertEquals('C', accept);
            } catch (Exception e) {
                fail();
            }
        }

        @Test
        @DisplayName("FAIL LOWER BOUND")
        void checkingGradeFailLowerBound() {
            try {
                char accept = calculation.gardeCalculation(TESTINGNames.FAIL_LOWER_BOUND);
                assertEquals('F', accept);
            } catch (Exception e) {
                fail();
            }
        }

        @Test
        @DisplayName("GRADE A UPPER BOUND")
        void checkingGradeAupperBound() {
            try {
                char accept = calculation.gardeCalculation(TESTINGNames.GRADE_A_UPPER_BOUND);
                assertEquals('A', accept);
            } catch (Exception e) {
                fail();
            }
        }

        @Test
        @DisplayName("GRADE B UPPER BOUND")
        void checkingGradeBupperBound() {
            try {
                char accept = calculation.gardeCalculation(TESTINGNames.GRADE_B_UPPER_BOUND);
                assertEquals('B', accept);
            } catch (Exception e) {
                fail();
            }
        }

        @Test
        @DisplayName("GRADE C UPPER BOUND")
        void checkingGradeCupperBound() {
            try {
                char accept = calculation.gardeCalculation(TESTINGNames.GRADE_C_UPPER_BOUND);
                assertEquals('C', accept);
            } catch (Exception e) {
                fail();
            }
        }

        @Test
        @DisplayName("FAIL UPPER BOUND")
        void checkingGradeFailupperBound() {
            try {
                char accept = calculation.gardeCalculation(TESTINGNames.FAIL_UPPER_BOUND);
                assertEquals('F', accept);
            } catch (Exception e) {
                fail();
            }
        }

        @Test
        @DisplayName("ZERO MARKS TEST")
        void checkingGradeFailZero() {
            try {
                char accept = calculation.gardeCalculation(TESTINGNames.ZERO_MARK);
                assertEquals('F', accept);
            } catch (Exception e) {
                fail();
            }
        }
    }

        @org.junit.jupiter.api.Nested
        @DisplayName("will start 4 credit tests....")
        class Grade4CreditTest {
            @BeforeAll
            static void startMethod() {
                System.out.println("Started 4 credit tests");
            }

            @AfterAll
            static void afterMethod() {
                System.out.println("Finished 4 credit tests");
            }


            static Credit4MarksCalculation calculation;

            @BeforeAll
            static void StartProgram() {
                calculation = new Credit4MarksCalculation();
            }

            @Test
            @DisplayName("Testing Negetive Mark")
            void NegativeMarkChecking() {
                Exception exception = assertThrows(Exception.class, () -> {
                    calculation.gardeCalculation(TESTINGNames.NOT_IN_RANGE_EXTRA);
                });
                if (exception != null) {
                    String detected = exception.getMessage();
                    String actual = "Given input is not in range";
                    assertEquals(actual, detected);
                } else {
                    fail();
                }
            }

            @Test
            @DisplayName("Testing Extra Mark")
            void ExtraNotRangeMarkChecking() {
                Exception exception = assertThrows(Exception.class, () -> {
                    calculation.gardeCalculation(TESTINGNames.NOT_IN_RANGE_NEG);
                });
                if (exception != null) {
                    String detected = exception.getMessage();
                    String actual = "Given input is not in range";
                    assertEquals(actual, detected);
                } else {
                    fail();
                }
            }

            @Test
            @DisplayName("NON NUMBER MARKS")
            void NonNumberMarksChecking() {
                Exception exception = assertThrows(Exception.class, () -> {
                    calculation.gardeCalculation(TESTINGNames.NON_NUMBER_MARK);
                });
                if (exception != null) {
                    String detected = exception.getMessage();
                    String actual = "Given Input is not a number";
                    assertEquals(actual, detected);
                } else {
                    fail();
                }
            }

            @Test
            @DisplayName("MARKS_NEG_LOWER_BOUND CHECK")
            void NEG_NumberLOWER_BOUND_MarksChecking() {
                Exception exception = assertThrows(Exception.class, () -> {
                    calculation.gardeCalculation(TESTINGNames.MARKS_NEG_LOWER_BOUND);
                });
                if (exception != null) {
                    String detected = exception.getMessage();
                    String actual = "Given input is not in range";
                    assertEquals(actual, detected);
                } else {
                    fail();
                }
            }

            @Test
            @DisplayName("MARKS_POS_BOUNDARY_MAX TESTING")
            void POS_max_boundary_marks() {
                Exception exception = assertThrows(Exception.class, () -> {
                    calculation.gardeCalculation(TESTINGNames.MARKS_POS_BOUNDARY_MAX);
                });
                if (exception != null) {
                    String detected = exception.getMessage();
                    String actual = "Given input is not in range";
                    assertEquals(actual, detected);
                } else {
                    fail();
                }
            }

            @Test
            @DisplayName("GRADE A CHECKING")
            void checkingGradeA() {
                try {
                    char accept = calculation.gardeCalculation(TESTINGNames.CREDIT4_GRADE_A);
                    assertEquals('A', accept);
                } catch (Exception e) {
                    fail();
                }
            }

            @Test
            @DisplayName("GRADE B CHECKING")
            void checkingGradeB() {
                try {
                    char accept = calculation.gardeCalculation(TESTINGNames.CREDIT4_GRADE_B);
                    assertEquals('B', accept);
                } catch (Exception e) {
                    fail();
                }
            }

            @Test
            @DisplayName("GRADE C CHECKING")
            void checkingGradeC() {
                try {
                    char accept = calculation.gardeCalculation(TESTINGNames.CREDIT4_GRADE_C);
                    assertEquals('C', accept);
                } catch (Exception e) {
                    fail();
                }
            }

            @Test
            @DisplayName("FAIL CHECKING")
            void checkingFail() {
                try {
                    char accept = calculation.gardeCalculation(TESTINGNames.FAIL_MARK);
                    assertEquals('F', accept);
                } catch (Exception e) {
                    fail();
                }
            }

            @Test
            @DisplayName("GRADE A LOWER BOUND")
            void checkingGradeAlowerBound() {
                try {
                    char accept = calculation.gardeCalculation(TESTINGNames.CREDIT4_GRADE_A_LOWER_BOUND);
                    assertEquals('A', accept);
                } catch (Exception e) {
                    fail();
                }
            }

            @Test
            @DisplayName("GRADE B LOWER BOUND")
            void checkingGradeBlowerBound() {
                try {
                    char accept = calculation.gardeCalculation(TESTINGNames.CREDIT4_GRADE_B_LOWER_BOUND);
                    assertEquals('B', accept);
                } catch (Exception e) {
                    fail();
                }
            }

            @Test
            @DisplayName("GRADE C LOWER BOUND")
            void checkingGradeClowerBound() {
                try {
                    char accept = calculation.gardeCalculation(TESTINGNames.CREDIT4_GRADE_C_LOWER_BOUND);
                    assertEquals('C', accept);
                } catch (Exception e) {
                    fail();
                }
            }

            @Test
            @DisplayName("FAIL LOWER BOUND")
            void checkingGradeFailLowerBound() {
                try {
                    char accept = calculation.gardeCalculation(TESTINGNames.FAIL_LOWER_BOUND);
                    assertEquals('F', accept);
                } catch (Exception e) {
                    fail();
                }
            }

            @Test
            @DisplayName("GRADE A UPPER BOUND")
            void checkingGradeAupperBound() {
                try {
                    char accept = calculation.gardeCalculation(TESTINGNames.CREDIT4_GRADE_A_UPPER_BOUND);
                    assertEquals('A', accept);
                } catch (Exception e) {
                    fail();
                }
            }

            @Test
            @DisplayName("GRADE B UPPER BOUND")
            void checkingGradeBupperBound() {
                try {
                    char accept = calculation.gardeCalculation(TESTINGNames.CREDIT4_GRADE_B_UPPER_BOUND);
                    assertEquals('B', accept);
                } catch (Exception e) {
                    fail();
                }
            }

            @Test
            @DisplayName("GRADE C UPPER BOUND")
            void checkingGradeCupperBound() {
                try {
                    char accept = calculation.gardeCalculation(TESTINGNames.CREDIT4_GRADE_C_UPPER_BOUND);
                    assertEquals('C', accept);
                } catch (Exception e) {
                    fail();
                }
            }

            @Test
            @DisplayName("FAIL UPPER BOUND")
            void checkingGradeFailupperBound() {
                try {
                    char accept = calculation.gardeCalculation(TESTINGNames.FAIL_UPPER_BOUND);
                    assertEquals('F', accept);
                } catch (Exception e) {
                    fail();
                }
            }

            @Test
            @DisplayName("ZERO MARKS TEST")
            void checkingGradeFailZero() {
                try {
                    char accept = calculation.gardeCalculation(TESTINGNames.ZERO_MARK);
                    assertEquals('F', accept);
                } catch (Exception e) {
                    fail();
                }
            }


        }
    }
