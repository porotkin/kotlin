/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.cfg;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.test.generators.GenerateCompilerTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@RunWith(JUnit3RunnerWithInners.class)
public class ControlFlowTestGenerated extends AbstractControlFlowTest {
  @TestMetadata("compiler/testData/cfg")
  @TestDataPath("$PROJECT_ROOT")
  @RunWith(JUnit3RunnerWithInners.class)
  public static class Cfg extends AbstractControlFlowTest {
    private void runTest(String testDataFilePath) {
      KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInCfg() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/cfg"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("compiler/testData/cfg/arrays")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Arrays extends AbstractControlFlowTest {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
      }

      public void testAllFilesPresentInArrays() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/cfg/arrays"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @TestMetadata("ArrayAccess.kt")
      public void testArrayAccess() {
        runTest("compiler/testData/cfg/arrays/ArrayAccess.kt");
      }

      @TestMetadata("arrayAccessExpression.kt")
      public void testArrayAccessExpression() {
        runTest("compiler/testData/cfg/arrays/arrayAccessExpression.kt");
      }

      @TestMetadata("arrayInc.kt")
      public void testArrayInc() {
        runTest("compiler/testData/cfg/arrays/arrayInc.kt");
      }

      @TestMetadata("arrayIncUnresolved.kt")
      public void testArrayIncUnresolved() {
        runTest("compiler/testData/cfg/arrays/arrayIncUnresolved.kt");
      }

      @TestMetadata("ArrayOfFunctions.kt")
      public void testArrayOfFunctions() {
        runTest("compiler/testData/cfg/arrays/ArrayOfFunctions.kt");
      }

      @TestMetadata("arraySet.kt")
      public void testArraySet() {
        runTest("compiler/testData/cfg/arrays/arraySet.kt");
      }

      @TestMetadata("arraySetNoRHS.kt")
      public void testArraySetNoRHS() {
        runTest("compiler/testData/cfg/arrays/arraySetNoRHS.kt");
      }

      @TestMetadata("arraySetPlusAssign.kt")
      public void testArraySetPlusAssign() {
        runTest("compiler/testData/cfg/arrays/arraySetPlusAssign.kt");
      }

      @TestMetadata("arraySetPlusAssignUnresolved.kt")
      public void testArraySetPlusAssignUnresolved() {
        runTest("compiler/testData/cfg/arrays/arraySetPlusAssignUnresolved.kt");
      }

      @TestMetadata("arraySetUnresolved.kt")
      public void testArraySetUnresolved() {
        runTest("compiler/testData/cfg/arrays/arraySetUnresolved.kt");
      }
    }

    @TestMetadata("compiler/testData/cfg/basic")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Basic extends AbstractControlFlowTest {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
      }

      public void testAllFilesPresentInBasic() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/cfg/basic"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @TestMetadata("Basic.kt")
      public void testBasic() {
        runTest("compiler/testData/cfg/basic/Basic.kt");
      }

      @TestMetadata("EmptyFunction.kt")
      public void testEmptyFunction() {
        runTest("compiler/testData/cfg/basic/EmptyFunction.kt");
      }

      @TestMetadata("ShortFunction.kt")
      public void testShortFunction() {
        runTest("compiler/testData/cfg/basic/ShortFunction.kt");
      }
    }

    @TestMetadata("compiler/testData/cfg/bugs")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Bugs extends AbstractControlFlowTest {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
      }

      public void testAllFilesPresentInBugs() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/cfg/bugs"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @TestMetadata("functionalCallInEnumEntry.kt")
      public void testFunctionalCallInEnumEntry() {
        runTest("compiler/testData/cfg/bugs/functionalCallInEnumEntry.kt");
      }

      @TestMetadata("jumpToOuterScope.kt")
      public void testJumpToOuterScope() {
        runTest("compiler/testData/cfg/bugs/jumpToOuterScope.kt");
      }

      @TestMetadata("kt10105.kt")
      public void testKt10105() {
        runTest("compiler/testData/cfg/bugs/kt10105.kt");
      }

      @TestMetadata("kt37447.kt")
      public void testKt37447() {
        runTest("compiler/testData/cfg/bugs/kt37447.kt");
      }

      @TestMetadata("kt44153.kt")
      public void testKt44153() {
        runTest("compiler/testData/cfg/bugs/kt44153.kt");
      }

      @TestMetadata("kt7761.kt")
      public void testKt7761() {
        runTest("compiler/testData/cfg/bugs/kt7761.kt");
      }

      @TestMetadata("setWithTypeMismatch.kt")
      public void testSetWithTypeMismatch() {
        runTest("compiler/testData/cfg/bugs/setWithTypeMismatch.kt");
      }

      @TestMetadata("unresolvedInvokeOnResolvedVar.kt")
      public void testUnresolvedInvokeOnResolvedVar() {
        runTest("compiler/testData/cfg/bugs/unresolvedInvokeOnResolvedVar.kt");
      }
    }

    @TestMetadata("compiler/testData/cfg/controlStructures")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class ControlStructures extends AbstractControlFlowTest {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
      }

      public void testAllFilesPresentInControlStructures() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/cfg/controlStructures"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @TestMetadata("breakContinueInTryFinally.kt")
      public void testBreakContinueInTryFinally() {
        runTest("compiler/testData/cfg/controlStructures/breakContinueInTryFinally.kt");
      }

      @TestMetadata("breakInsideLocal.kt")
      public void testBreakInsideLocal() {
        runTest("compiler/testData/cfg/controlStructures/breakInsideLocal.kt");
      }

      @TestMetadata("continueInDoWhile.kt")
      public void testContinueInDoWhile() {
        runTest("compiler/testData/cfg/controlStructures/continueInDoWhile.kt");
      }

      @TestMetadata("continueInFor.kt")
      public void testContinueInFor() {
        runTest("compiler/testData/cfg/controlStructures/continueInFor.kt");
      }

      @TestMetadata("continueInWhile.kt")
      public void testContinueInWhile() {
        runTest("compiler/testData/cfg/controlStructures/continueInWhile.kt");
      }

      @TestMetadata("Finally.kt")
      public void testFinally() {
        runTest("compiler/testData/cfg/controlStructures/Finally.kt");
      }

      @TestMetadata("FinallyTestCopy.kt")
      public void testFinallyTestCopy() {
        runTest("compiler/testData/cfg/controlStructures/FinallyTestCopy.kt");
      }

      @TestMetadata("For.kt")
      public void testFor() {
        runTest("compiler/testData/cfg/controlStructures/For.kt");
      }

      @TestMetadata("If.kt")
      public void testIf() {
        runTest("compiler/testData/cfg/controlStructures/If.kt");
      }

      @TestMetadata("incorrectIndex_After.kt")
      public void testIncorrectIndex_After() {
        runTest("compiler/testData/cfg/controlStructures/incorrectIndex_After.kt");
      }

      @TestMetadata("incorrectIndex_Before.kt")
      public void testIncorrectIndex_Before() {
        runTest("compiler/testData/cfg/controlStructures/incorrectIndex_Before.kt");
      }

      @TestMetadata("InfiniteLoops.kt")
      public void testInfiniteLoops() {
        runTest("compiler/testData/cfg/controlStructures/InfiniteLoops.kt");
      }

      @TestMetadata("localAndNonlocalReturnsWithFinally.kt")
      public void testLocalAndNonlocalReturnsWithFinally() {
        runTest("compiler/testData/cfg/controlStructures/localAndNonlocalReturnsWithFinally.kt");
      }

      @TestMetadata("localFunctionInFinally.kt")
      public void testLocalFunctionInFinally() {
        runTest("compiler/testData/cfg/controlStructures/localFunctionInFinally.kt");
      }

      @TestMetadata("OnlyWhileInFunctionBody.kt")
      public void testOnlyWhileInFunctionBody() {
        runTest("compiler/testData/cfg/controlStructures/OnlyWhileInFunctionBody.kt");
      }

      @TestMetadata("returnsInWhen.kt")
      public void testReturnsInWhen() {
        runTest("compiler/testData/cfg/controlStructures/returnsInWhen.kt");
      }

      @TestMetadata("whenConditions.kt")
      public void testWhenConditions() {
        runTest("compiler/testData/cfg/controlStructures/whenConditions.kt");
      }

      @TestMetadata("whenExhaustive.kt")
      public void testWhenExhaustive() {
        runTest("compiler/testData/cfg/controlStructures/whenExhaustive.kt");
      }
    }

    @TestMetadata("compiler/testData/cfg/conventions")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Conventions extends AbstractControlFlowTest {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
      }

      public void testAllFilesPresentInConventions() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/cfg/conventions"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @TestMetadata("bothReceivers.kt")
      public void testBothReceivers() {
        runTest("compiler/testData/cfg/conventions/bothReceivers.kt");
      }

      @TestMetadata("equals.kt")
      public void testEquals() {
        runTest("compiler/testData/cfg/conventions/equals.kt");
      }

      @TestMetadata("incrementAtTheEnd.kt")
      public void testIncrementAtTheEnd() {
        runTest("compiler/testData/cfg/conventions/incrementAtTheEnd.kt");
      }

      @TestMetadata("invoke.kt")
      public void testInvoke() {
        runTest("compiler/testData/cfg/conventions/invoke.kt");
      }

      @TestMetadata("notEqual.kt")
      public void testNotEqual() {
        runTest("compiler/testData/cfg/conventions/notEqual.kt");
      }
    }

    @TestMetadata("compiler/testData/cfg/deadCode")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class DeadCode extends AbstractControlFlowTest {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
      }

      public void testAllFilesPresentInDeadCode() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/cfg/deadCode"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @TestMetadata("DeadCode.kt")
      public void testDeadCode() {
        runTest("compiler/testData/cfg/deadCode/DeadCode.kt");
      }

      @TestMetadata("notLocalReturn_after.kt")
      public void testNotLocalReturn_after() {
        runTest("compiler/testData/cfg/deadCode/notLocalReturn_after.kt");
      }

      @TestMetadata("notLocalReturn_before.kt")
      public void testNotLocalReturn_before() {
        runTest("compiler/testData/cfg/deadCode/notLocalReturn_before.kt");
      }

      @TestMetadata("returnInElvis.kt")
      public void testReturnInElvis() {
        runTest("compiler/testData/cfg/deadCode/returnInElvis.kt");
      }

      @TestMetadata("stringTemplate.kt")
      public void testStringTemplate() {
        runTest("compiler/testData/cfg/deadCode/stringTemplate.kt");
      }

      @TestMetadata("throwInLambda.kt")
      public void testThrowInLambda() {
        runTest("compiler/testData/cfg/deadCode/throwInLambda.kt");
      }
    }

    @TestMetadata("compiler/testData/cfg/declarations")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Declarations extends AbstractControlFlowTest {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
      }

      public void testAllFilesPresentInDeclarations() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/cfg/declarations"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @TestMetadata("compiler/testData/cfg/declarations/classesAndObjects")
      @TestDataPath("$PROJECT_ROOT")
      @RunWith(JUnit3RunnerWithInners.class)
      public static class ClassesAndObjects extends AbstractControlFlowTest {
        private void runTest(String testDataFilePath) {
          KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInClassesAndObjects() {
          KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/cfg/declarations/classesAndObjects"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("AnonymousInitializers.kt")
        public void testAnonymousInitializers() {
          runTest("compiler/testData/cfg/declarations/classesAndObjects/AnonymousInitializers.kt");
        }

        @TestMetadata("delegationByExpression.kt")
        public void testDelegationByExpression() {
          runTest("compiler/testData/cfg/declarations/classesAndObjects/delegationByExpression.kt");
        }

        @TestMetadata("delegationBySuperCall.kt")
        public void testDelegationBySuperCall() {
          runTest("compiler/testData/cfg/declarations/classesAndObjects/delegationBySuperCall.kt");
        }

        @TestMetadata("EnumEntryRefersCompanion.kt")
        public void testEnumEntryRefersCompanion() {
          runTest("compiler/testData/cfg/declarations/classesAndObjects/EnumEntryRefersCompanion.kt");
        }

        @TestMetadata("ObjectEnumQualifiers.kt")
        public void testObjectEnumQualifiers() {
          runTest("compiler/testData/cfg/declarations/classesAndObjects/ObjectEnumQualifiers.kt");
        }

        @TestMetadata("QualifierReceiverWithOthers.kt")
        public void testQualifierReceiverWithOthers() {
          runTest("compiler/testData/cfg/declarations/classesAndObjects/QualifierReceiverWithOthers.kt");
        }
      }

      @TestMetadata("compiler/testData/cfg/declarations/functionLiterals")
      @TestDataPath("$PROJECT_ROOT")
      @RunWith(JUnit3RunnerWithInners.class)
      public static class FunctionLiterals extends AbstractControlFlowTest {
        private void runTest(String testDataFilePath) {
          KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInFunctionLiterals() {
          KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/cfg/declarations/functionLiterals"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("unusedFunctionLiteral.kt")
        public void testUnusedFunctionLiteral() {
          runTest("compiler/testData/cfg/declarations/functionLiterals/unusedFunctionLiteral.kt");
        }
      }

      @TestMetadata("compiler/testData/cfg/declarations/functions")
      @TestDataPath("$PROJECT_ROOT")
      @RunWith(JUnit3RunnerWithInners.class)
      public static class Functions extends AbstractControlFlowTest {
        private void runTest(String testDataFilePath) {
          KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInFunctions() {
          KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/cfg/declarations/functions"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("anonymousFunctionInBlock.kt")
        public void testAnonymousFunctionInBlock() {
          runTest("compiler/testData/cfg/declarations/functions/anonymousFunctionInBlock.kt");
        }

        @TestMetadata("FailFunction.kt")
        public void testFailFunction() {
          runTest("compiler/testData/cfg/declarations/functions/FailFunction.kt");
        }

        @TestMetadata("functionAsExpression.kt")
        public void testFunctionAsExpression() {
          runTest("compiler/testData/cfg/declarations/functions/functionAsExpression.kt");
        }

        @TestMetadata("namedFunctionInBlock.kt")
        public void testNamedFunctionInBlock() {
          runTest("compiler/testData/cfg/declarations/functions/namedFunctionInBlock.kt");
        }

        @TestMetadata("typeParameter.kt")
        public void testTypeParameter() {
          runTest("compiler/testData/cfg/declarations/functions/typeParameter.kt");
        }
      }

      @TestMetadata("compiler/testData/cfg/declarations/local")
      @TestDataPath("$PROJECT_ROOT")
      @RunWith(JUnit3RunnerWithInners.class)
      public static class Local extends AbstractControlFlowTest {
        private void runTest(String testDataFilePath) {
          KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInLocal() {
          KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/cfg/declarations/local"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("localClass.kt")
        public void testLocalClass() {
          runTest("compiler/testData/cfg/declarations/local/localClass.kt");
        }

        @TestMetadata("LocalDeclarations.kt")
        public void testLocalDeclarations() {
          runTest("compiler/testData/cfg/declarations/local/LocalDeclarations.kt");
        }

        @TestMetadata("localDelegatedVal.kt")
        public void testLocalDelegatedVal() {
          runTest("compiler/testData/cfg/declarations/local/localDelegatedVal.kt");
        }

        @TestMetadata("localFunction.kt")
        public void testLocalFunction() {
          runTest("compiler/testData/cfg/declarations/local/localFunction.kt");
        }

        @TestMetadata("localProperty.kt")
        public void testLocalProperty() {
          runTest("compiler/testData/cfg/declarations/local/localProperty.kt");
        }

        @TestMetadata("ObjectExpression.kt")
        public void testObjectExpression() {
          runTest("compiler/testData/cfg/declarations/local/ObjectExpression.kt");
        }
      }

      @TestMetadata("compiler/testData/cfg/declarations/multiDeclaration")
      @TestDataPath("$PROJECT_ROOT")
      @RunWith(JUnit3RunnerWithInners.class)
      public static class MultiDeclaration extends AbstractControlFlowTest {
        private void runTest(String testDataFilePath) {
          KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInMultiDeclaration() {
          KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/cfg/declarations/multiDeclaration"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("MultiDecl.kt")
        public void testMultiDecl() {
          runTest("compiler/testData/cfg/declarations/multiDeclaration/MultiDecl.kt");
        }

        @TestMetadata("multiDeclarationWithError.kt")
        public void testMultiDeclarationWithError() {
          runTest("compiler/testData/cfg/declarations/multiDeclaration/multiDeclarationWithError.kt");
        }
      }

      @TestMetadata("compiler/testData/cfg/declarations/properties")
      @TestDataPath("$PROJECT_ROOT")
      @RunWith(JUnit3RunnerWithInners.class)
      public static class Properties extends AbstractControlFlowTest {
        private void runTest(String testDataFilePath) {
          KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInProperties() {
          KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/cfg/declarations/properties"), Pattern.compile("^(.+)\\.kt$"), null, true);
        }

        @TestMetadata("DelegatedProperty.kt")
        public void testDelegatedProperty() {
          runTest("compiler/testData/cfg/declarations/properties/DelegatedProperty.kt");
        }

        @TestMetadata("unreachableDelegation.kt")
        public void testUnreachableDelegation() {
          runTest("compiler/testData/cfg/declarations/properties/unreachableDelegation.kt");
        }
      }
    }

    @TestMetadata("compiler/testData/cfg/expressions")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Expressions extends AbstractControlFlowTest {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
      }

      public void testAllFilesPresentInExpressions() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/cfg/expressions"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @TestMetadata("assignmentToThis.kt")
      public void testAssignmentToThis() {
        runTest("compiler/testData/cfg/expressions/assignmentToThis.kt");
      }

      @TestMetadata("Assignments.kt")
      public void testAssignments() {
        runTest("compiler/testData/cfg/expressions/Assignments.kt");
      }

      @TestMetadata("callableReferences.kt")
      public void testCallableReferences() {
        runTest("compiler/testData/cfg/expressions/callableReferences.kt");
      }

      @TestMetadata("casts.kt")
      public void testCasts() {
        runTest("compiler/testData/cfg/expressions/casts.kt");
      }

      @TestMetadata("chainedQualifiedExpression.kt")
      public void testChainedQualifiedExpression() {
        runTest("compiler/testData/cfg/expressions/chainedQualifiedExpression.kt");
      }

      @TestMetadata("expressionAsFunction.kt")
      public void testExpressionAsFunction() {
        runTest("compiler/testData/cfg/expressions/expressionAsFunction.kt");
      }

      @TestMetadata("incdec.kt")
      public void testIncdec() {
        runTest("compiler/testData/cfg/expressions/incdec.kt");
      }

      @TestMetadata("invalidVariableCall.kt")
      public void testInvalidVariableCall() {
        runTest("compiler/testData/cfg/expressions/invalidVariableCall.kt");
      }

      @TestMetadata("labeledExpression.kt")
      public void testLabeledExpression() {
        runTest("compiler/testData/cfg/expressions/labeledExpression.kt");
      }

      @TestMetadata("LazyBooleans.kt")
      public void testLazyBooleans() {
        runTest("compiler/testData/cfg/expressions/LazyBooleans.kt");
      }

      @TestMetadata("nothingExpr.kt")
      public void testNothingExpr() {
        runTest("compiler/testData/cfg/expressions/nothingExpr.kt");
      }

      @TestMetadata("parenthesizedSelector.kt")
      public void testParenthesizedSelector() {
        runTest("compiler/testData/cfg/expressions/parenthesizedSelector.kt");
      }

      @TestMetadata("propertySafeCall.kt")
      public void testPropertySafeCall() {
        runTest("compiler/testData/cfg/expressions/propertySafeCall.kt");
      }

      @TestMetadata("qualifiedExpressionWithoutSelector.kt")
      public void testQualifiedExpressionWithoutSelector() {
        runTest("compiler/testData/cfg/expressions/qualifiedExpressionWithoutSelector.kt");
      }

      @TestMetadata("ReturnFromExpression.kt")
      public void testReturnFromExpression() {
        runTest("compiler/testData/cfg/expressions/ReturnFromExpression.kt");
      }

      @TestMetadata("thisExpression.kt")
      public void testThisExpression() {
        runTest("compiler/testData/cfg/expressions/thisExpression.kt");
      }

      @TestMetadata("unresolvedCall.kt")
      public void testUnresolvedCall() {
        runTest("compiler/testData/cfg/expressions/unresolvedCall.kt");
      }

      @TestMetadata("unresolvedCalls.kt")
      public void testUnresolvedCalls() {
        runTest("compiler/testData/cfg/expressions/unresolvedCalls.kt");
      }

      @TestMetadata("unresolvedCallsWithReceiver.kt")
      public void testUnresolvedCallsWithReceiver() {
        runTest("compiler/testData/cfg/expressions/unresolvedCallsWithReceiver.kt");
      }

      @TestMetadata("unresolvedProperty.kt")
      public void testUnresolvedProperty() {
        runTest("compiler/testData/cfg/expressions/unresolvedProperty.kt");
      }

      @TestMetadata("unresolvedWriteLHS.kt")
      public void testUnresolvedWriteLHS() {
        runTest("compiler/testData/cfg/expressions/unresolvedWriteLHS.kt");
      }

      @TestMetadata("unsupportedReturns.kt")
      public void testUnsupportedReturns() {
        runTest("compiler/testData/cfg/expressions/unsupportedReturns.kt");
      }

      @TestMetadata("unusedExpressionSimpleName.kt")
      public void testUnusedExpressionSimpleName() {
        runTest("compiler/testData/cfg/expressions/unusedExpressionSimpleName.kt");
      }
    }

    @TestMetadata("compiler/testData/cfg/functions")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Functions extends AbstractControlFlowTest {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
      }

      public void testAllFilesPresentInFunctions() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/cfg/functions"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @TestMetadata("DefaultValuesForArguments.kt")
      public void testDefaultValuesForArguments() {
        runTest("compiler/testData/cfg/functions/DefaultValuesForArguments.kt");
      }

      @TestMetadata("unmappedArgs.kt")
      public void testUnmappedArgs() {
        runTest("compiler/testData/cfg/functions/unmappedArgs.kt");
      }
    }

    @TestMetadata("compiler/testData/cfg/secondaryConstructors")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SecondaryConstructors extends AbstractControlFlowTest {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
      }

      public void testAllFilesPresentInSecondaryConstructors() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/cfg/secondaryConstructors"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @TestMetadata("withPrimary.kt")
      public void testWithPrimary() {
        runTest("compiler/testData/cfg/secondaryConstructors/withPrimary.kt");
      }

      @TestMetadata("withPrimarySuper.kt")
      public void testWithPrimarySuper() {
        runTest("compiler/testData/cfg/secondaryConstructors/withPrimarySuper.kt");
      }

      @TestMetadata("withReturn.kt")
      public void testWithReturn() {
        runTest("compiler/testData/cfg/secondaryConstructors/withReturn.kt");
      }

      @TestMetadata("withoutPrimary.kt")
      public void testWithoutPrimary() {
        runTest("compiler/testData/cfg/secondaryConstructors/withoutPrimary.kt");
      }

      @TestMetadata("withoutPrimarySuper.kt")
      public void testWithoutPrimarySuper() {
        runTest("compiler/testData/cfg/secondaryConstructors/withoutPrimarySuper.kt");
      }
    }

    @TestMetadata("compiler/testData/cfg/tailCalls")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TailCalls extends AbstractControlFlowTest {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
      }

      public void testAllFilesPresentInTailCalls() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/cfg/tailCalls"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @TestMetadata("finally.kt")
      public void testFinally() {
        runTest("compiler/testData/cfg/tailCalls/finally.kt");
      }

      @TestMetadata("finallyWithReturn.kt")
      public void testFinallyWithReturn() {
        runTest("compiler/testData/cfg/tailCalls/finallyWithReturn.kt");
      }

      @TestMetadata("sum.kt")
      public void testSum() {
        runTest("compiler/testData/cfg/tailCalls/sum.kt");
      }

      @TestMetadata("try.kt")
      public void testTry() {
        runTest("compiler/testData/cfg/tailCalls/try.kt");
      }

      @TestMetadata("tryCatchFinally.kt")
      public void testTryCatchFinally() {
        runTest("compiler/testData/cfg/tailCalls/tryCatchFinally.kt");
      }
    }
  }

  @TestMetadata("compiler/testData/cfgWithStdLib")
  @TestDataPath("$PROJECT_ROOT")
  @RunWith(JUnit3RunnerWithInners.class)
  public static class CfgWithStdLib extends AbstractControlFlowTest {
    private void runTest(String testDataFilePath) {
      KotlinTestUtils.runTest(this::doTestWithStdLib, this, testDataFilePath);
    }

    public void testAllFilesPresentInCfgWithStdLib() {
      KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/cfgWithStdLib"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @TestMetadata("compiler/testData/cfgWithStdLib/contracts")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Contracts extends AbstractControlFlowTest {
      private void runTest(String testDataFilePath) {
        KotlinTestUtils.runTest(this::doTestWithStdLib, this, testDataFilePath);
      }

      public void testAllFilesPresentInContracts() {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/cfgWithStdLib/contracts"), Pattern.compile("^(.+)\\.kt$"), null, true);
      }

      @TestMetadata("labeledReturns.kt")
      public void testLabeledReturns() {
        runTest("compiler/testData/cfgWithStdLib/contracts/labeledReturns.kt");
      }

      @TestMetadata("nonReturningInlinedLambda.kt")
      public void testNonReturningInlinedLambda() {
        runTest("compiler/testData/cfgWithStdLib/contracts/nonReturningInlinedLambda.kt");
      }

      @TestMetadata("returnsAndCalls.kt")
      public void testReturnsAndCalls() {
        runTest("compiler/testData/cfgWithStdLib/contracts/returnsAndCalls.kt");
      }

      @TestMetadata("safeCallAndInPlaceReturn.kt")
      public void testSafeCallAndInPlaceReturn() {
        runTest("compiler/testData/cfgWithStdLib/contracts/safeCallAndInPlaceReturn.kt");
      }

      @TestMetadata("throwIfNotCalled.kt")
      public void testThrowIfNotCalled() {
        runTest("compiler/testData/cfgWithStdLib/contracts/throwIfNotCalled.kt");
      }

      @TestMetadata("tryCatchFinally.kt")
      public void testTryCatchFinally() {
        runTest("compiler/testData/cfgWithStdLib/contracts/tryCatchFinally.kt");
      }
    }
  }
}
