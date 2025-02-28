/**
 * Copyright (c) 2016 NumberFour AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   NumberFour AG - Initial API and implementation
 */
package org.eclipse.n4js.n4JS.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.n4js.n4JS.*;

import org.eclipse.n4js.ts.typeRefs.TypeRef;
import org.eclipse.n4js.ts.typeRefs.Versionable;
import org.eclipse.n4js.ts.typeRefs.VersionedReference;

import org.eclipse.n4js.ts.types.IdentifiableElement;
import org.eclipse.n4js.ts.types.TypableElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.n4js.n4JS.N4JSPackage
 * @generated
 */
public class N4JSSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static N4JSPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public N4JSSwitch() {
		if (modelPackage == null) {
			modelPackage = N4JSPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case N4JSPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T1 result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.CONTROL_FLOW_ELEMENT: {
				ControlFlowElement controlFlowElement = (ControlFlowElement)theEObject;
				T1 result = caseControlFlowElement(controlFlowElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.SCRIPT: {
				Script script = (Script)theEObject;
				T1 result = caseScript(script);
				if (result == null) result = caseVariableEnvironmentElement(script);
				if (result == null) result = caseAnnotableElement(script);
				if (result == null) result = caseControlFlowElement(script);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.SCRIPT_ELEMENT: {
				ScriptElement scriptElement = (ScriptElement)theEObject;
				T1 result = caseScriptElement(scriptElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.EXPORT_DECLARATION: {
				ExportDeclaration exportDeclaration = (ExportDeclaration)theEObject;
				T1 result = caseExportDeclaration(exportDeclaration);
				if (result == null) result = caseAnnotableScriptElement(exportDeclaration);
				if (result == null) result = caseAnnotableElement(exportDeclaration);
				if (result == null) result = caseScriptElement(exportDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.EXPORT_SPECIFIER: {
				ExportSpecifier exportSpecifier = (ExportSpecifier)theEObject;
				T1 result = caseExportSpecifier(exportSpecifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.EXPORTABLE_ELEMENT: {
				ExportableElement exportableElement = (ExportableElement)theEObject;
				T1 result = caseExportableElement(exportableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.IMPORT_DECLARATION: {
				ImportDeclaration importDeclaration = (ImportDeclaration)theEObject;
				T1 result = caseImportDeclaration(importDeclaration);
				if (result == null) result = caseAnnotableScriptElement(importDeclaration);
				if (result == null) result = caseAnnotableElement(importDeclaration);
				if (result == null) result = caseScriptElement(importDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.IMPORT_SPECIFIER: {
				ImportSpecifier importSpecifier = (ImportSpecifier)theEObject;
				T1 result = caseImportSpecifier(importSpecifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.NAMED_IMPORT_SPECIFIER: {
				NamedImportSpecifier namedImportSpecifier = (NamedImportSpecifier)theEObject;
				T1 result = caseNamedImportSpecifier(namedImportSpecifier);
				if (result == null) result = caseImportSpecifier(namedImportSpecifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.DEFAULT_IMPORT_SPECIFIER: {
				DefaultImportSpecifier defaultImportSpecifier = (DefaultImportSpecifier)theEObject;
				T1 result = caseDefaultImportSpecifier(defaultImportSpecifier);
				if (result == null) result = caseNamedImportSpecifier(defaultImportSpecifier);
				if (result == null) result = caseImportSpecifier(defaultImportSpecifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.NAMESPACE_IMPORT_SPECIFIER: {
				NamespaceImportSpecifier namespaceImportSpecifier = (NamespaceImportSpecifier)theEObject;
				T1 result = caseNamespaceImportSpecifier(namespaceImportSpecifier);
				if (result == null) result = caseImportSpecifier(namespaceImportSpecifier);
				if (result == null) result = caseTypeDefiningElement(namespaceImportSpecifier);
				if (result == null) result = caseTypableElement(namespaceImportSpecifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.TYPE_REFERENCE_NODE: {
				TypeReferenceNode<?> typeReferenceNode = (TypeReferenceNode<?>)theEObject;
				T1 result = caseTypeReferenceNode(typeReferenceNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.TYPE_PROVIDING_ELEMENT: {
				TypeProvidingElement typeProvidingElement = (TypeProvidingElement)theEObject;
				T1 result = caseTypeProvidingElement(typeProvidingElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				T1 result = caseTypedElement(typedElement);
				if (result == null) result = caseTypeProvidingElement(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.VARIABLE_ENVIRONMENT_ELEMENT: {
				VariableEnvironmentElement variableEnvironmentElement = (VariableEnvironmentElement)theEObject;
				T1 result = caseVariableEnvironmentElement(variableEnvironmentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.THIS_TARGET: {
				ThisTarget thisTarget = (ThisTarget)theEObject;
				T1 result = caseThisTarget(thisTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.THIS_ARG_PROVIDER: {
				ThisArgProvider thisArgProvider = (ThisArgProvider)theEObject;
				T1 result = caseThisArgProvider(thisArgProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T1 result = caseVariable(variable);
				if (result == null) result = caseTypedElement(variable);
				if (result == null) result = caseIdentifiableElement(variable);
				if (result == null) result = caseNamedElement(variable);
				if (result == null) result = caseTypeProvidingElement(variable);
				if (result == null) result = caseTypableElement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ANNOTABLE_ELEMENT: {
				AnnotableElement annotableElement = (AnnotableElement)theEObject;
				T1 result = caseAnnotableElement(annotableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ANNOTABLE_SCRIPT_ELEMENT: {
				AnnotableScriptElement annotableScriptElement = (AnnotableScriptElement)theEObject;
				T1 result = caseAnnotableScriptElement(annotableScriptElement);
				if (result == null) result = caseAnnotableElement(annotableScriptElement);
				if (result == null) result = caseScriptElement(annotableScriptElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ANNOTABLE_EXPRESSION: {
				AnnotableExpression annotableExpression = (AnnotableExpression)theEObject;
				T1 result = caseAnnotableExpression(annotableExpression);
				if (result == null) result = caseAnnotableElement(annotableExpression);
				if (result == null) result = caseExpression(annotableExpression);
				if (result == null) result = caseTypableElement(annotableExpression);
				if (result == null) result = caseControlFlowElement(annotableExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ABSTRACT_ANNOTATION_LIST: {
				AbstractAnnotationList abstractAnnotationList = (AbstractAnnotationList)theEObject;
				T1 result = caseAbstractAnnotationList(abstractAnnotationList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ANNOTATION_LIST: {
				AnnotationList annotationList = (AnnotationList)theEObject;
				T1 result = caseAnnotationList(annotationList);
				if (result == null) result = caseAbstractAnnotationList(annotationList);
				if (result == null) result = caseStatement(annotationList);
				if (result == null) result = caseExportableElement(annotationList);
				if (result == null) result = caseScriptElement(annotationList);
				if (result == null) result = caseControlFlowElement(annotationList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.EXPRESSION_ANNOTATION_LIST: {
				ExpressionAnnotationList expressionAnnotationList = (ExpressionAnnotationList)theEObject;
				T1 result = caseExpressionAnnotationList(expressionAnnotationList);
				if (result == null) result = caseAbstractAnnotationList(expressionAnnotationList);
				if (result == null) result = caseExpression(expressionAnnotationList);
				if (result == null) result = caseTypableElement(expressionAnnotationList);
				if (result == null) result = caseControlFlowElement(expressionAnnotationList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T1 result = caseAnnotation(annotation);
				if (result == null) result = caseNamedElement(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ANNOTATION_ARGUMENT: {
				AnnotationArgument annotationArgument = (AnnotationArgument)theEObject;
				T1 result = caseAnnotationArgument(annotationArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.LITERAL_ANNOTATION_ARGUMENT: {
				LiteralAnnotationArgument literalAnnotationArgument = (LiteralAnnotationArgument)theEObject;
				T1 result = caseLiteralAnnotationArgument(literalAnnotationArgument);
				if (result == null) result = caseAnnotationArgument(literalAnnotationArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.TYPE_REF_ANNOTATION_ARGUMENT: {
				TypeRefAnnotationArgument typeRefAnnotationArgument = (TypeRefAnnotationArgument)theEObject;
				T1 result = caseTypeRefAnnotationArgument(typeRefAnnotationArgument);
				if (result == null) result = caseAnnotationArgument(typeRefAnnotationArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.FUNCTION_OR_FIELD_ACCESSOR: {
				FunctionOrFieldAccessor functionOrFieldAccessor = (FunctionOrFieldAccessor)theEObject;
				T1 result = caseFunctionOrFieldAccessor(functionOrFieldAccessor);
				if (result == null) result = caseAnnotableElement(functionOrFieldAccessor);
				if (result == null) result = caseVariableEnvironmentElement(functionOrFieldAccessor);
				if (result == null) result = caseThisArgProvider(functionOrFieldAccessor);
				if (result == null) result = caseTypableElement(functionOrFieldAccessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.FUNCTION_DEFINITION: {
				FunctionDefinition functionDefinition = (FunctionDefinition)theEObject;
				T1 result = caseFunctionDefinition(functionDefinition);
				if (result == null) result = caseFunctionOrFieldAccessor(functionDefinition);
				if (result == null) result = caseTypeDefiningElement(functionDefinition);
				if (result == null) result = caseVersionedElement(functionDefinition);
				if (result == null) result = caseAnnotableElement(functionDefinition);
				if (result == null) result = caseVariableEnvironmentElement(functionDefinition);
				if (result == null) result = caseThisArgProvider(functionDefinition);
				if (result == null) result = caseTypableElement(functionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.FIELD_ACCESSOR: {
				FieldAccessor fieldAccessor = (FieldAccessor)theEObject;
				T1 result = caseFieldAccessor(fieldAccessor);
				if (result == null) result = caseFunctionOrFieldAccessor(fieldAccessor);
				if (result == null) result = caseTypeProvidingElement(fieldAccessor);
				if (result == null) result = casePropertyNameOwner(fieldAccessor);
				if (result == null) result = caseAnnotableElement(fieldAccessor);
				if (result == null) result = caseVariableEnvironmentElement(fieldAccessor);
				if (result == null) result = caseThisArgProvider(fieldAccessor);
				if (result == null) result = caseTypableElement(fieldAccessor);
				if (result == null) result = caseNamedElement(fieldAccessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.FUNCTION_DECLARATION: {
				FunctionDeclaration functionDeclaration = (FunctionDeclaration)theEObject;
				T1 result = caseFunctionDeclaration(functionDeclaration);
				if (result == null) result = caseAnnotableScriptElement(functionDeclaration);
				if (result == null) result = caseModifiableElement(functionDeclaration);
				if (result == null) result = caseStatement(functionDeclaration);
				if (result == null) result = caseFunctionDefinition(functionDeclaration);
				if (result == null) result = caseGenericDeclaration(functionDeclaration);
				if (result == null) result = caseExportableElement(functionDeclaration);
				if (result == null) result = caseNamedElement(functionDeclaration);
				if (result == null) result = caseScriptElement(functionDeclaration);
				if (result == null) result = caseControlFlowElement(functionDeclaration);
				if (result == null) result = caseFunctionOrFieldAccessor(functionDeclaration);
				if (result == null) result = caseTypeDefiningElement(functionDeclaration);
				if (result == null) result = caseVersionedElement(functionDeclaration);
				if (result == null) result = caseAnnotableElement(functionDeclaration);
				if (result == null) result = caseVariableEnvironmentElement(functionDeclaration);
				if (result == null) result = caseThisArgProvider(functionDeclaration);
				if (result == null) result = caseTypableElement(functionDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.FUNCTION_EXPRESSION: {
				FunctionExpression functionExpression = (FunctionExpression)theEObject;
				T1 result = caseFunctionExpression(functionExpression);
				if (result == null) result = caseFunctionDefinition(functionExpression);
				if (result == null) result = caseAnnotableExpression(functionExpression);
				if (result == null) result = caseGenericDeclaration(functionExpression);
				if (result == null) result = caseNamedElement(functionExpression);
				if (result == null) result = caseFunctionOrFieldAccessor(functionExpression);
				if (result == null) result = caseTypeDefiningElement(functionExpression);
				if (result == null) result = caseVersionedElement(functionExpression);
				if (result == null) result = caseExpression(functionExpression);
				if (result == null) result = caseAnnotableElement(functionExpression);
				if (result == null) result = caseVariableEnvironmentElement(functionExpression);
				if (result == null) result = caseThisArgProvider(functionExpression);
				if (result == null) result = caseTypableElement(functionExpression);
				if (result == null) result = caseControlFlowElement(functionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ARROW_FUNCTION: {
				ArrowFunction arrowFunction = (ArrowFunction)theEObject;
				T1 result = caseArrowFunction(arrowFunction);
				if (result == null) result = caseFunctionExpression(arrowFunction);
				if (result == null) result = caseFunctionDefinition(arrowFunction);
				if (result == null) result = caseAnnotableExpression(arrowFunction);
				if (result == null) result = caseGenericDeclaration(arrowFunction);
				if (result == null) result = caseNamedElement(arrowFunction);
				if (result == null) result = caseFunctionOrFieldAccessor(arrowFunction);
				if (result == null) result = caseTypeDefiningElement(arrowFunction);
				if (result == null) result = caseVersionedElement(arrowFunction);
				if (result == null) result = caseExpression(arrowFunction);
				if (result == null) result = caseAnnotableElement(arrowFunction);
				if (result == null) result = caseVariableEnvironmentElement(arrowFunction);
				if (result == null) result = caseThisArgProvider(arrowFunction);
				if (result == null) result = caseTypableElement(arrowFunction);
				if (result == null) result = caseControlFlowElement(arrowFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.LOCAL_ARGUMENTS_VARIABLE: {
				LocalArgumentsVariable localArgumentsVariable = (LocalArgumentsVariable)theEObject;
				T1 result = caseLocalArgumentsVariable(localArgumentsVariable);
				if (result == null) result = caseVariable(localArgumentsVariable);
				if (result == null) result = caseTypedElement(localArgumentsVariable);
				if (result == null) result = caseIdentifiableElement(localArgumentsVariable);
				if (result == null) result = caseNamedElement(localArgumentsVariable);
				if (result == null) result = caseTypeProvidingElement(localArgumentsVariable);
				if (result == null) result = caseTypableElement(localArgumentsVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.FORMAL_PARAMETER: {
				FormalParameter formalParameter = (FormalParameter)theEObject;
				T1 result = caseFormalParameter(formalParameter);
				if (result == null) result = caseAnnotableElement(formalParameter);
				if (result == null) result = caseVariable(formalParameter);
				if (result == null) result = caseTypedElement(formalParameter);
				if (result == null) result = caseIdentifiableElement(formalParameter);
				if (result == null) result = caseNamedElement(formalParameter);
				if (result == null) result = caseTypeProvidingElement(formalParameter);
				if (result == null) result = caseTypableElement(formalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.BLOCK: {
				Block block = (Block)theEObject;
				T1 result = caseBlock(block);
				if (result == null) result = caseStatement(block);
				if (result == null) result = caseVariableEnvironmentElement(block);
				if (result == null) result = caseScriptElement(block);
				if (result == null) result = caseControlFlowElement(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T1 result = caseStatement(statement);
				if (result == null) result = caseScriptElement(statement);
				if (result == null) result = caseControlFlowElement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.VARIABLE_DECLARATION_CONTAINER: {
				VariableDeclarationContainer variableDeclarationContainer = (VariableDeclarationContainer)theEObject;
				T1 result = caseVariableDeclarationContainer(variableDeclarationContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.VARIABLE_STATEMENT: {
				VariableStatement variableStatement = (VariableStatement)theEObject;
				T1 result = caseVariableStatement(variableStatement);
				if (result == null) result = caseStatement(variableStatement);
				if (result == null) result = caseVariableDeclarationContainer(variableStatement);
				if (result == null) result = caseScriptElement(variableStatement);
				if (result == null) result = caseControlFlowElement(variableStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.EXPORTED_VARIABLE_STATEMENT: {
				ExportedVariableStatement exportedVariableStatement = (ExportedVariableStatement)theEObject;
				T1 result = caseExportedVariableStatement(exportedVariableStatement);
				if (result == null) result = caseVariableStatement(exportedVariableStatement);
				if (result == null) result = caseExportableElement(exportedVariableStatement);
				if (result == null) result = caseAnnotableScriptElement(exportedVariableStatement);
				if (result == null) result = caseModifiableElement(exportedVariableStatement);
				if (result == null) result = caseStatement(exportedVariableStatement);
				if (result == null) result = caseVariableDeclarationContainer(exportedVariableStatement);
				if (result == null) result = caseAnnotableElement(exportedVariableStatement);
				if (result == null) result = caseScriptElement(exportedVariableStatement);
				if (result == null) result = caseControlFlowElement(exportedVariableStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.VARIABLE_DECLARATION_OR_BINDING: {
				VariableDeclarationOrBinding variableDeclarationOrBinding = (VariableDeclarationOrBinding)theEObject;
				T1 result = caseVariableDeclarationOrBinding(variableDeclarationOrBinding);
				if (result == null) result = caseControlFlowElement(variableDeclarationOrBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.VARIABLE_BINDING: {
				VariableBinding variableBinding = (VariableBinding)theEObject;
				T1 result = caseVariableBinding(variableBinding);
				if (result == null) result = caseVariableDeclarationOrBinding(variableBinding);
				if (result == null) result = caseControlFlowElement(variableBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.EXPORTED_VARIABLE_BINDING: {
				ExportedVariableBinding exportedVariableBinding = (ExportedVariableBinding)theEObject;
				T1 result = caseExportedVariableBinding(exportedVariableBinding);
				if (result == null) result = caseVariableBinding(exportedVariableBinding);
				if (result == null) result = caseVariableDeclarationOrBinding(exportedVariableBinding);
				if (result == null) result = caseControlFlowElement(exportedVariableBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.VARIABLE_DECLARATION: {
				VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
				T1 result = caseVariableDeclaration(variableDeclaration);
				if (result == null) result = caseVariableDeclarationOrBinding(variableDeclaration);
				if (result == null) result = caseAnnotableElement(variableDeclaration);
				if (result == null) result = caseVariable(variableDeclaration);
				if (result == null) result = caseControlFlowElement(variableDeclaration);
				if (result == null) result = caseTypedElement(variableDeclaration);
				if (result == null) result = caseIdentifiableElement(variableDeclaration);
				if (result == null) result = caseNamedElement(variableDeclaration);
				if (result == null) result = caseTypeProvidingElement(variableDeclaration);
				if (result == null) result = caseTypableElement(variableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.EXPORTED_VARIABLE_DECLARATION: {
				ExportedVariableDeclaration exportedVariableDeclaration = (ExportedVariableDeclaration)theEObject;
				T1 result = caseExportedVariableDeclaration(exportedVariableDeclaration);
				if (result == null) result = caseVariableDeclaration(exportedVariableDeclaration);
				if (result == null) result = caseVariableDeclarationOrBinding(exportedVariableDeclaration);
				if (result == null) result = caseAnnotableElement(exportedVariableDeclaration);
				if (result == null) result = caseVariable(exportedVariableDeclaration);
				if (result == null) result = caseControlFlowElement(exportedVariableDeclaration);
				if (result == null) result = caseTypedElement(exportedVariableDeclaration);
				if (result == null) result = caseIdentifiableElement(exportedVariableDeclaration);
				if (result == null) result = caseNamedElement(exportedVariableDeclaration);
				if (result == null) result = caseTypeProvidingElement(exportedVariableDeclaration);
				if (result == null) result = caseTypableElement(exportedVariableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.EMPTY_STATEMENT: {
				EmptyStatement emptyStatement = (EmptyStatement)theEObject;
				T1 result = caseEmptyStatement(emptyStatement);
				if (result == null) result = caseStatement(emptyStatement);
				if (result == null) result = caseScriptElement(emptyStatement);
				if (result == null) result = caseControlFlowElement(emptyStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.EXPRESSION_STATEMENT: {
				ExpressionStatement expressionStatement = (ExpressionStatement)theEObject;
				T1 result = caseExpressionStatement(expressionStatement);
				if (result == null) result = caseStatement(expressionStatement);
				if (result == null) result = caseScriptElement(expressionStatement);
				if (result == null) result = caseControlFlowElement(expressionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.IF_STATEMENT: {
				IfStatement ifStatement = (IfStatement)theEObject;
				T1 result = caseIfStatement(ifStatement);
				if (result == null) result = caseStatement(ifStatement);
				if (result == null) result = caseScriptElement(ifStatement);
				if (result == null) result = caseControlFlowElement(ifStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ITERATION_STATEMENT: {
				IterationStatement iterationStatement = (IterationStatement)theEObject;
				T1 result = caseIterationStatement(iterationStatement);
				if (result == null) result = caseStatement(iterationStatement);
				if (result == null) result = caseScriptElement(iterationStatement);
				if (result == null) result = caseControlFlowElement(iterationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.DO_STATEMENT: {
				DoStatement doStatement = (DoStatement)theEObject;
				T1 result = caseDoStatement(doStatement);
				if (result == null) result = caseIterationStatement(doStatement);
				if (result == null) result = caseStatement(doStatement);
				if (result == null) result = caseScriptElement(doStatement);
				if (result == null) result = caseControlFlowElement(doStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.WHILE_STATEMENT: {
				WhileStatement whileStatement = (WhileStatement)theEObject;
				T1 result = caseWhileStatement(whileStatement);
				if (result == null) result = caseIterationStatement(whileStatement);
				if (result == null) result = caseStatement(whileStatement);
				if (result == null) result = caseScriptElement(whileStatement);
				if (result == null) result = caseControlFlowElement(whileStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.FOR_STATEMENT: {
				ForStatement forStatement = (ForStatement)theEObject;
				T1 result = caseForStatement(forStatement);
				if (result == null) result = caseVariableDeclarationContainer(forStatement);
				if (result == null) result = caseIterationStatement(forStatement);
				if (result == null) result = caseVariableEnvironmentElement(forStatement);
				if (result == null) result = caseStatement(forStatement);
				if (result == null) result = caseScriptElement(forStatement);
				if (result == null) result = caseControlFlowElement(forStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.LABEL_REF: {
				LabelRef labelRef = (LabelRef)theEObject;
				T1 result = caseLabelRef(labelRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.CONTINUE_STATEMENT: {
				ContinueStatement continueStatement = (ContinueStatement)theEObject;
				T1 result = caseContinueStatement(continueStatement);
				if (result == null) result = caseStatement(continueStatement);
				if (result == null) result = caseLabelRef(continueStatement);
				if (result == null) result = caseScriptElement(continueStatement);
				if (result == null) result = caseControlFlowElement(continueStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.BREAK_STATEMENT: {
				BreakStatement breakStatement = (BreakStatement)theEObject;
				T1 result = caseBreakStatement(breakStatement);
				if (result == null) result = caseStatement(breakStatement);
				if (result == null) result = caseLabelRef(breakStatement);
				if (result == null) result = caseScriptElement(breakStatement);
				if (result == null) result = caseControlFlowElement(breakStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.RETURN_STATEMENT: {
				ReturnStatement returnStatement = (ReturnStatement)theEObject;
				T1 result = caseReturnStatement(returnStatement);
				if (result == null) result = caseStatement(returnStatement);
				if (result == null) result = caseScriptElement(returnStatement);
				if (result == null) result = caseControlFlowElement(returnStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.WITH_STATEMENT: {
				WithStatement withStatement = (WithStatement)theEObject;
				T1 result = caseWithStatement(withStatement);
				if (result == null) result = caseStatement(withStatement);
				if (result == null) result = caseVariableEnvironmentElement(withStatement);
				if (result == null) result = caseScriptElement(withStatement);
				if (result == null) result = caseControlFlowElement(withStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.SWITCH_STATEMENT: {
				SwitchStatement switchStatement = (SwitchStatement)theEObject;
				T1 result = caseSwitchStatement(switchStatement);
				if (result == null) result = caseStatement(switchStatement);
				if (result == null) result = caseVariableEnvironmentElement(switchStatement);
				if (result == null) result = caseScriptElement(switchStatement);
				if (result == null) result = caseControlFlowElement(switchStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ABSTRACT_CASE_CLAUSE: {
				AbstractCaseClause abstractCaseClause = (AbstractCaseClause)theEObject;
				T1 result = caseAbstractCaseClause(abstractCaseClause);
				if (result == null) result = caseControlFlowElement(abstractCaseClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.CASE_CLAUSE: {
				CaseClause caseClause = (CaseClause)theEObject;
				T1 result = caseCaseClause(caseClause);
				if (result == null) result = caseAbstractCaseClause(caseClause);
				if (result == null) result = caseControlFlowElement(caseClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.DEFAULT_CLAUSE: {
				DefaultClause defaultClause = (DefaultClause)theEObject;
				T1 result = caseDefaultClause(defaultClause);
				if (result == null) result = caseAbstractCaseClause(defaultClause);
				if (result == null) result = caseControlFlowElement(defaultClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.LABELLED_STATEMENT: {
				LabelledStatement labelledStatement = (LabelledStatement)theEObject;
				T1 result = caseLabelledStatement(labelledStatement);
				if (result == null) result = caseStatement(labelledStatement);
				if (result == null) result = caseNamedElement(labelledStatement);
				if (result == null) result = caseScriptElement(labelledStatement);
				if (result == null) result = caseControlFlowElement(labelledStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.THROW_STATEMENT: {
				ThrowStatement throwStatement = (ThrowStatement)theEObject;
				T1 result = caseThrowStatement(throwStatement);
				if (result == null) result = caseStatement(throwStatement);
				if (result == null) result = caseScriptElement(throwStatement);
				if (result == null) result = caseControlFlowElement(throwStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.TRY_STATEMENT: {
				TryStatement tryStatement = (TryStatement)theEObject;
				T1 result = caseTryStatement(tryStatement);
				if (result == null) result = caseStatement(tryStatement);
				if (result == null) result = caseScriptElement(tryStatement);
				if (result == null) result = caseControlFlowElement(tryStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ABSTRACT_CATCH_BLOCK: {
				AbstractCatchBlock abstractCatchBlock = (AbstractCatchBlock)theEObject;
				T1 result = caseAbstractCatchBlock(abstractCatchBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.CATCH_BLOCK: {
				CatchBlock catchBlock = (CatchBlock)theEObject;
				T1 result = caseCatchBlock(catchBlock);
				if (result == null) result = caseAbstractCatchBlock(catchBlock);
				if (result == null) result = caseVariableEnvironmentElement(catchBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.CATCH_VARIABLE: {
				CatchVariable catchVariable = (CatchVariable)theEObject;
				T1 result = caseCatchVariable(catchVariable);
				if (result == null) result = caseVariable(catchVariable);
				if (result == null) result = caseTypedElement(catchVariable);
				if (result == null) result = caseIdentifiableElement(catchVariable);
				if (result == null) result = caseNamedElement(catchVariable);
				if (result == null) result = caseTypeProvidingElement(catchVariable);
				if (result == null) result = caseTypableElement(catchVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.FINALLY_BLOCK: {
				FinallyBlock finallyBlock = (FinallyBlock)theEObject;
				T1 result = caseFinallyBlock(finallyBlock);
				if (result == null) result = caseAbstractCatchBlock(finallyBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.DEBUGGER_STATEMENT: {
				DebuggerStatement debuggerStatement = (DebuggerStatement)theEObject;
				T1 result = caseDebuggerStatement(debuggerStatement);
				if (result == null) result = caseStatement(debuggerStatement);
				if (result == null) result = caseScriptElement(debuggerStatement);
				if (result == null) result = caseControlFlowElement(debuggerStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.PRIMARY_EXPRESSION: {
				PrimaryExpression primaryExpression = (PrimaryExpression)theEObject;
				T1 result = casePrimaryExpression(primaryExpression);
				if (result == null) result = caseExpression(primaryExpression);
				if (result == null) result = caseTypableElement(primaryExpression);
				if (result == null) result = caseControlFlowElement(primaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.PAREN_EXPRESSION: {
				ParenExpression parenExpression = (ParenExpression)theEObject;
				T1 result = caseParenExpression(parenExpression);
				if (result == null) result = casePrimaryExpression(parenExpression);
				if (result == null) result = caseExpression(parenExpression);
				if (result == null) result = caseTypableElement(parenExpression);
				if (result == null) result = caseControlFlowElement(parenExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.IDENTIFIER_REF: {
				IdentifierRef identifierRef = (IdentifierRef)theEObject;
				T1 result = caseIdentifierRef(identifierRef);
				if (result == null) result = casePrimaryExpression(identifierRef);
				if (result == null) result = caseStrictModeRelevant(identifierRef);
				if (result == null) result = caseVersionable(identifierRef);
				if (result == null) result = caseExpression(identifierRef);
				if (result == null) result = caseTypableElement(identifierRef);
				if (result == null) result = caseControlFlowElement(identifierRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.STRICT_MODE_RELEVANT: {
				StrictModeRelevant strictModeRelevant = (StrictModeRelevant)theEObject;
				T1 result = caseStrictModeRelevant(strictModeRelevant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.SUPER_LITERAL: {
				SuperLiteral superLiteral = (SuperLiteral)theEObject;
				T1 result = caseSuperLiteral(superLiteral);
				if (result == null) result = casePrimaryExpression(superLiteral);
				if (result == null) result = caseExpression(superLiteral);
				if (result == null) result = caseTypableElement(superLiteral);
				if (result == null) result = caseControlFlowElement(superLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.THIS_LITERAL: {
				ThisLiteral thisLiteral = (ThisLiteral)theEObject;
				T1 result = caseThisLiteral(thisLiteral);
				if (result == null) result = casePrimaryExpression(thisLiteral);
				if (result == null) result = caseStrictModeRelevant(thisLiteral);
				if (result == null) result = caseExpression(thisLiteral);
				if (result == null) result = caseTypableElement(thisLiteral);
				if (result == null) result = caseControlFlowElement(thisLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ARRAY_LITERAL: {
				ArrayLiteral arrayLiteral = (ArrayLiteral)theEObject;
				T1 result = caseArrayLiteral(arrayLiteral);
				if (result == null) result = casePrimaryExpression(arrayLiteral);
				if (result == null) result = caseExpression(arrayLiteral);
				if (result == null) result = caseTypableElement(arrayLiteral);
				if (result == null) result = caseControlFlowElement(arrayLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ARRAY_ELEMENT: {
				ArrayElement arrayElement = (ArrayElement)theEObject;
				T1 result = caseArrayElement(arrayElement);
				if (result == null) result = caseTypableElement(arrayElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ARRAY_PADDING: {
				ArrayPadding arrayPadding = (ArrayPadding)theEObject;
				T1 result = caseArrayPadding(arrayPadding);
				if (result == null) result = caseArrayElement(arrayPadding);
				if (result == null) result = caseTypableElement(arrayPadding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.OBJECT_LITERAL: {
				ObjectLiteral objectLiteral = (ObjectLiteral)theEObject;
				T1 result = caseObjectLiteral(objectLiteral);
				if (result == null) result = casePrimaryExpression(objectLiteral);
				if (result == null) result = caseThisTarget(objectLiteral);
				if (result == null) result = caseTypeDefiningElement(objectLiteral);
				if (result == null) result = caseExpression(objectLiteral);
				if (result == null) result = caseTypableElement(objectLiteral);
				if (result == null) result = caseControlFlowElement(objectLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.PROPERTY_ASSIGNMENT: {
				PropertyAssignment propertyAssignment = (PropertyAssignment)theEObject;
				T1 result = casePropertyAssignment(propertyAssignment);
				if (result == null) result = caseAnnotableElement(propertyAssignment);
				if (result == null) result = caseVariableEnvironmentElement(propertyAssignment);
				if (result == null) result = casePropertyNameOwner(propertyAssignment);
				if (result == null) result = caseTypableElement(propertyAssignment);
				if (result == null) result = caseNamedElement(propertyAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.PROPERTY_NAME_OWNER: {
				PropertyNameOwner propertyNameOwner = (PropertyNameOwner)theEObject;
				T1 result = casePropertyNameOwner(propertyNameOwner);
				if (result == null) result = caseNamedElement(propertyNameOwner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.LITERAL_OR_COMPUTED_PROPERTY_NAME: {
				LiteralOrComputedPropertyName literalOrComputedPropertyName = (LiteralOrComputedPropertyName)theEObject;
				T1 result = caseLiteralOrComputedPropertyName(literalOrComputedPropertyName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ANNOTABLE_PROPERTY_ASSIGNMENT: {
				AnnotablePropertyAssignment annotablePropertyAssignment = (AnnotablePropertyAssignment)theEObject;
				T1 result = caseAnnotablePropertyAssignment(annotablePropertyAssignment);
				if (result == null) result = casePropertyAssignment(annotablePropertyAssignment);
				if (result == null) result = caseAnnotableElement(annotablePropertyAssignment);
				if (result == null) result = caseVariableEnvironmentElement(annotablePropertyAssignment);
				if (result == null) result = casePropertyNameOwner(annotablePropertyAssignment);
				if (result == null) result = caseTypableElement(annotablePropertyAssignment);
				if (result == null) result = caseNamedElement(annotablePropertyAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.PROPERTY_ASSIGNMENT_ANNOTATION_LIST: {
				PropertyAssignmentAnnotationList propertyAssignmentAnnotationList = (PropertyAssignmentAnnotationList)theEObject;
				T1 result = casePropertyAssignmentAnnotationList(propertyAssignmentAnnotationList);
				if (result == null) result = caseAbstractAnnotationList(propertyAssignmentAnnotationList);
				if (result == null) result = casePropertyAssignment(propertyAssignmentAnnotationList);
				if (result == null) result = caseAnnotableElement(propertyAssignmentAnnotationList);
				if (result == null) result = caseVariableEnvironmentElement(propertyAssignmentAnnotationList);
				if (result == null) result = casePropertyNameOwner(propertyAssignmentAnnotationList);
				if (result == null) result = caseTypableElement(propertyAssignmentAnnotationList);
				if (result == null) result = caseNamedElement(propertyAssignmentAnnotationList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.PROPERTY_NAME_VALUE_PAIR: {
				PropertyNameValuePair propertyNameValuePair = (PropertyNameValuePair)theEObject;
				T1 result = casePropertyNameValuePair(propertyNameValuePair);
				if (result == null) result = caseAnnotablePropertyAssignment(propertyNameValuePair);
				if (result == null) result = caseTypedElement(propertyNameValuePair);
				if (result == null) result = casePropertyAssignment(propertyNameValuePair);
				if (result == null) result = caseTypeProvidingElement(propertyNameValuePair);
				if (result == null) result = caseAnnotableElement(propertyNameValuePair);
				if (result == null) result = caseVariableEnvironmentElement(propertyNameValuePair);
				if (result == null) result = casePropertyNameOwner(propertyNameValuePair);
				if (result == null) result = caseTypableElement(propertyNameValuePair);
				if (result == null) result = caseNamedElement(propertyNameValuePair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.PROPERTY_NAME_VALUE_PAIR_SINGLE_NAME: {
				PropertyNameValuePairSingleName propertyNameValuePairSingleName = (PropertyNameValuePairSingleName)theEObject;
				T1 result = casePropertyNameValuePairSingleName(propertyNameValuePairSingleName);
				if (result == null) result = casePropertyNameValuePair(propertyNameValuePairSingleName);
				if (result == null) result = caseAnnotablePropertyAssignment(propertyNameValuePairSingleName);
				if (result == null) result = caseTypedElement(propertyNameValuePairSingleName);
				if (result == null) result = casePropertyAssignment(propertyNameValuePairSingleName);
				if (result == null) result = caseTypeProvidingElement(propertyNameValuePairSingleName);
				if (result == null) result = caseAnnotableElement(propertyNameValuePairSingleName);
				if (result == null) result = caseVariableEnvironmentElement(propertyNameValuePairSingleName);
				if (result == null) result = casePropertyNameOwner(propertyNameValuePairSingleName);
				if (result == null) result = caseTypableElement(propertyNameValuePairSingleName);
				if (result == null) result = caseNamedElement(propertyNameValuePairSingleName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.PROPERTY_METHOD_DECLARATION: {
				PropertyMethodDeclaration propertyMethodDeclaration = (PropertyMethodDeclaration)theEObject;
				T1 result = casePropertyMethodDeclaration(propertyMethodDeclaration);
				if (result == null) result = caseAnnotablePropertyAssignment(propertyMethodDeclaration);
				if (result == null) result = caseMethodDeclaration(propertyMethodDeclaration);
				if (result == null) result = casePropertyAssignment(propertyMethodDeclaration);
				if (result == null) result = caseFunctionDefinition(propertyMethodDeclaration);
				if (result == null) result = caseGenericDeclaration(propertyMethodDeclaration);
				if (result == null) result = casePropertyNameOwner(propertyMethodDeclaration);
				if (result == null) result = caseFunctionOrFieldAccessor(propertyMethodDeclaration);
				if (result == null) result = caseTypeDefiningElement(propertyMethodDeclaration);
				if (result == null) result = caseVersionedElement(propertyMethodDeclaration);
				if (result == null) result = caseAnnotableElement(propertyMethodDeclaration);
				if (result == null) result = caseVariableEnvironmentElement(propertyMethodDeclaration);
				if (result == null) result = caseNamedElement(propertyMethodDeclaration);
				if (result == null) result = caseTypableElement(propertyMethodDeclaration);
				if (result == null) result = caseThisArgProvider(propertyMethodDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.GETTER_DECLARATION: {
				GetterDeclaration getterDeclaration = (GetterDeclaration)theEObject;
				T1 result = caseGetterDeclaration(getterDeclaration);
				if (result == null) result = caseFieldAccessor(getterDeclaration);
				if (result == null) result = caseTypedElement(getterDeclaration);
				if (result == null) result = caseFunctionOrFieldAccessor(getterDeclaration);
				if (result == null) result = caseTypeProvidingElement(getterDeclaration);
				if (result == null) result = casePropertyNameOwner(getterDeclaration);
				if (result == null) result = caseAnnotableElement(getterDeclaration);
				if (result == null) result = caseVariableEnvironmentElement(getterDeclaration);
				if (result == null) result = caseThisArgProvider(getterDeclaration);
				if (result == null) result = caseTypableElement(getterDeclaration);
				if (result == null) result = caseNamedElement(getterDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.SETTER_DECLARATION: {
				SetterDeclaration setterDeclaration = (SetterDeclaration)theEObject;
				T1 result = caseSetterDeclaration(setterDeclaration);
				if (result == null) result = caseFieldAccessor(setterDeclaration);
				if (result == null) result = caseFunctionOrFieldAccessor(setterDeclaration);
				if (result == null) result = caseTypeProvidingElement(setterDeclaration);
				if (result == null) result = casePropertyNameOwner(setterDeclaration);
				if (result == null) result = caseAnnotableElement(setterDeclaration);
				if (result == null) result = caseVariableEnvironmentElement(setterDeclaration);
				if (result == null) result = caseThisArgProvider(setterDeclaration);
				if (result == null) result = caseTypableElement(setterDeclaration);
				if (result == null) result = caseNamedElement(setterDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.PROPERTY_GETTER_DECLARATION: {
				PropertyGetterDeclaration propertyGetterDeclaration = (PropertyGetterDeclaration)theEObject;
				T1 result = casePropertyGetterDeclaration(propertyGetterDeclaration);
				if (result == null) result = caseGetterDeclaration(propertyGetterDeclaration);
				if (result == null) result = caseAnnotablePropertyAssignment(propertyGetterDeclaration);
				if (result == null) result = caseFieldAccessor(propertyGetterDeclaration);
				if (result == null) result = caseTypedElement(propertyGetterDeclaration);
				if (result == null) result = casePropertyAssignment(propertyGetterDeclaration);
				if (result == null) result = caseFunctionOrFieldAccessor(propertyGetterDeclaration);
				if (result == null) result = caseTypeProvidingElement(propertyGetterDeclaration);
				if (result == null) result = casePropertyNameOwner(propertyGetterDeclaration);
				if (result == null) result = caseAnnotableElement(propertyGetterDeclaration);
				if (result == null) result = caseVariableEnvironmentElement(propertyGetterDeclaration);
				if (result == null) result = caseThisArgProvider(propertyGetterDeclaration);
				if (result == null) result = caseTypableElement(propertyGetterDeclaration);
				if (result == null) result = caseNamedElement(propertyGetterDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.PROPERTY_SETTER_DECLARATION: {
				PropertySetterDeclaration propertySetterDeclaration = (PropertySetterDeclaration)theEObject;
				T1 result = casePropertySetterDeclaration(propertySetterDeclaration);
				if (result == null) result = caseSetterDeclaration(propertySetterDeclaration);
				if (result == null) result = caseAnnotablePropertyAssignment(propertySetterDeclaration);
				if (result == null) result = caseFieldAccessor(propertySetterDeclaration);
				if (result == null) result = casePropertyAssignment(propertySetterDeclaration);
				if (result == null) result = caseFunctionOrFieldAccessor(propertySetterDeclaration);
				if (result == null) result = caseTypeProvidingElement(propertySetterDeclaration);
				if (result == null) result = casePropertyNameOwner(propertySetterDeclaration);
				if (result == null) result = caseAnnotableElement(propertySetterDeclaration);
				if (result == null) result = caseVariableEnvironmentElement(propertySetterDeclaration);
				if (result == null) result = caseThisArgProvider(propertySetterDeclaration);
				if (result == null) result = caseTypableElement(propertySetterDeclaration);
				if (result == null) result = caseNamedElement(propertySetterDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.PROPERTY_SPREAD: {
				PropertySpread propertySpread = (PropertySpread)theEObject;
				T1 result = casePropertySpread(propertySpread);
				if (result == null) result = caseAnnotablePropertyAssignment(propertySpread);
				if (result == null) result = casePropertyAssignment(propertySpread);
				if (result == null) result = caseAnnotableElement(propertySpread);
				if (result == null) result = caseVariableEnvironmentElement(propertySpread);
				if (result == null) result = casePropertyNameOwner(propertySpread);
				if (result == null) result = caseTypableElement(propertySpread);
				if (result == null) result = caseNamedElement(propertySpread);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T1 result = caseExpression(expression);
				if (result == null) result = caseTypableElement(expression);
				if (result == null) result = caseControlFlowElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.NEW_TARGET: {
				NewTarget newTarget = (NewTarget)theEObject;
				T1 result = caseNewTarget(newTarget);
				if (result == null) result = caseExpression(newTarget);
				if (result == null) result = caseTypableElement(newTarget);
				if (result == null) result = caseControlFlowElement(newTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.NEW_EXPRESSION: {
				NewExpression newExpression = (NewExpression)theEObject;
				T1 result = caseNewExpression(newExpression);
				if (result == null) result = caseExpression(newExpression);
				if (result == null) result = caseParameterizedAccess(newExpression);
				if (result == null) result = caseTypableElement(newExpression);
				if (result == null) result = caseControlFlowElement(newExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.PARAMETERIZED_ACCESS: {
				ParameterizedAccess parameterizedAccess = (ParameterizedAccess)theEObject;
				T1 result = caseParameterizedAccess(parameterizedAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.EXPRESSION_WITH_TARGET: {
				ExpressionWithTarget expressionWithTarget = (ExpressionWithTarget)theEObject;
				T1 result = caseExpressionWithTarget(expressionWithTarget);
				if (result == null) result = caseExpression(expressionWithTarget);
				if (result == null) result = caseTypableElement(expressionWithTarget);
				if (result == null) result = caseControlFlowElement(expressionWithTarget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.PARAMETERIZED_CALL_EXPRESSION: {
				ParameterizedCallExpression parameterizedCallExpression = (ParameterizedCallExpression)theEObject;
				T1 result = caseParameterizedCallExpression(parameterizedCallExpression);
				if (result == null) result = caseExpressionWithTarget(parameterizedCallExpression);
				if (result == null) result = caseParameterizedAccess(parameterizedCallExpression);
				if (result == null) result = caseExpression(parameterizedCallExpression);
				if (result == null) result = caseTypableElement(parameterizedCallExpression);
				if (result == null) result = caseControlFlowElement(parameterizedCallExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.IMPORT_CALL_EXPRESSION: {
				ImportCallExpression importCallExpression = (ImportCallExpression)theEObject;
				T1 result = caseImportCallExpression(importCallExpression);
				if (result == null) result = caseExpression(importCallExpression);
				if (result == null) result = caseTypableElement(importCallExpression);
				if (result == null) result = caseControlFlowElement(importCallExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ARGUMENT: {
				Argument argument = (Argument)theEObject;
				T1 result = caseArgument(argument);
				if (result == null) result = caseTypableElement(argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.INDEXED_ACCESS_EXPRESSION: {
				IndexedAccessExpression indexedAccessExpression = (IndexedAccessExpression)theEObject;
				T1 result = caseIndexedAccessExpression(indexedAccessExpression);
				if (result == null) result = caseExpressionWithTarget(indexedAccessExpression);
				if (result == null) result = caseMemberAccess(indexedAccessExpression);
				if (result == null) result = caseExpression(indexedAccessExpression);
				if (result == null) result = caseTypableElement(indexedAccessExpression);
				if (result == null) result = caseControlFlowElement(indexedAccessExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.TAGGED_TEMPLATE_STRING: {
				TaggedTemplateString taggedTemplateString = (TaggedTemplateString)theEObject;
				T1 result = caseTaggedTemplateString(taggedTemplateString);
				if (result == null) result = caseExpressionWithTarget(taggedTemplateString);
				if (result == null) result = caseExpression(taggedTemplateString);
				if (result == null) result = caseTypableElement(taggedTemplateString);
				if (result == null) result = caseControlFlowElement(taggedTemplateString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.MEMBER_ACCESS: {
				MemberAccess memberAccess = (MemberAccess)theEObject;
				T1 result = caseMemberAccess(memberAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.PARAMETERIZED_PROPERTY_ACCESS_EXPRESSION: {
				ParameterizedPropertyAccessExpression parameterizedPropertyAccessExpression = (ParameterizedPropertyAccessExpression)theEObject;
				T1 result = caseParameterizedPropertyAccessExpression(parameterizedPropertyAccessExpression);
				if (result == null) result = caseExpressionWithTarget(parameterizedPropertyAccessExpression);
				if (result == null) result = caseMemberAccess(parameterizedPropertyAccessExpression);
				if (result == null) result = caseParameterizedAccess(parameterizedPropertyAccessExpression);
				if (result == null) result = caseExpression(parameterizedPropertyAccessExpression);
				if (result == null) result = caseTypableElement(parameterizedPropertyAccessExpression);
				if (result == null) result = caseControlFlowElement(parameterizedPropertyAccessExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.AWAIT_EXPRESSION: {
				AwaitExpression awaitExpression = (AwaitExpression)theEObject;
				T1 result = caseAwaitExpression(awaitExpression);
				if (result == null) result = caseExpression(awaitExpression);
				if (result == null) result = caseTypableElement(awaitExpression);
				if (result == null) result = caseControlFlowElement(awaitExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.PROMISIFY_EXPRESSION: {
				PromisifyExpression promisifyExpression = (PromisifyExpression)theEObject;
				T1 result = casePromisifyExpression(promisifyExpression);
				if (result == null) result = caseExpression(promisifyExpression);
				if (result == null) result = caseTypableElement(promisifyExpression);
				if (result == null) result = caseControlFlowElement(promisifyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.YIELD_EXPRESSION: {
				YieldExpression yieldExpression = (YieldExpression)theEObject;
				T1 result = caseYieldExpression(yieldExpression);
				if (result == null) result = caseExpression(yieldExpression);
				if (result == null) result = caseTypableElement(yieldExpression);
				if (result == null) result = caseControlFlowElement(yieldExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T1 result = caseLiteral(literal);
				if (result == null) result = casePrimaryExpression(literal);
				if (result == null) result = caseExpression(literal);
				if (result == null) result = caseTypableElement(literal);
				if (result == null) result = caseControlFlowElement(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.NULL_LITERAL: {
				NullLiteral nullLiteral = (NullLiteral)theEObject;
				T1 result = caseNullLiteral(nullLiteral);
				if (result == null) result = caseLiteral(nullLiteral);
				if (result == null) result = casePrimaryExpression(nullLiteral);
				if (result == null) result = caseExpression(nullLiteral);
				if (result == null) result = caseTypableElement(nullLiteral);
				if (result == null) result = caseControlFlowElement(nullLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.BOOLEAN_LITERAL: {
				BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
				T1 result = caseBooleanLiteral(booleanLiteral);
				if (result == null) result = caseLiteral(booleanLiteral);
				if (result == null) result = casePrimaryExpression(booleanLiteral);
				if (result == null) result = caseExpression(booleanLiteral);
				if (result == null) result = caseTypableElement(booleanLiteral);
				if (result == null) result = caseControlFlowElement(booleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.STRING_LITERAL: {
				StringLiteral stringLiteral = (StringLiteral)theEObject;
				T1 result = caseStringLiteral(stringLiteral);
				if (result == null) result = caseLiteral(stringLiteral);
				if (result == null) result = casePrimaryExpression(stringLiteral);
				if (result == null) result = caseExpression(stringLiteral);
				if (result == null) result = caseTypableElement(stringLiteral);
				if (result == null) result = caseControlFlowElement(stringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.TEMPLATE_LITERAL: {
				TemplateLiteral templateLiteral = (TemplateLiteral)theEObject;
				T1 result = caseTemplateLiteral(templateLiteral);
				if (result == null) result = casePrimaryExpression(templateLiteral);
				if (result == null) result = caseExpression(templateLiteral);
				if (result == null) result = caseTypableElement(templateLiteral);
				if (result == null) result = caseControlFlowElement(templateLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.TEMPLATE_SEGMENT: {
				TemplateSegment templateSegment = (TemplateSegment)theEObject;
				T1 result = caseTemplateSegment(templateSegment);
				if (result == null) result = caseLiteral(templateSegment);
				if (result == null) result = casePrimaryExpression(templateSegment);
				if (result == null) result = caseExpression(templateSegment);
				if (result == null) result = caseTypableElement(templateSegment);
				if (result == null) result = caseControlFlowElement(templateSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.NUMERIC_LITERAL: {
				NumericLiteral numericLiteral = (NumericLiteral)theEObject;
				T1 result = caseNumericLiteral(numericLiteral);
				if (result == null) result = caseLiteral(numericLiteral);
				if (result == null) result = casePrimaryExpression(numericLiteral);
				if (result == null) result = caseExpression(numericLiteral);
				if (result == null) result = caseTypableElement(numericLiteral);
				if (result == null) result = caseControlFlowElement(numericLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.DOUBLE_LITERAL: {
				DoubleLiteral doubleLiteral = (DoubleLiteral)theEObject;
				T1 result = caseDoubleLiteral(doubleLiteral);
				if (result == null) result = caseNumericLiteral(doubleLiteral);
				if (result == null) result = caseLiteral(doubleLiteral);
				if (result == null) result = casePrimaryExpression(doubleLiteral);
				if (result == null) result = caseExpression(doubleLiteral);
				if (result == null) result = caseTypableElement(doubleLiteral);
				if (result == null) result = caseControlFlowElement(doubleLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ABSTRACT_INT_LITERAL: {
				AbstractIntLiteral abstractIntLiteral = (AbstractIntLiteral)theEObject;
				T1 result = caseAbstractIntLiteral(abstractIntLiteral);
				if (result == null) result = caseNumericLiteral(abstractIntLiteral);
				if (result == null) result = caseLiteral(abstractIntLiteral);
				if (result == null) result = casePrimaryExpression(abstractIntLiteral);
				if (result == null) result = caseExpression(abstractIntLiteral);
				if (result == null) result = caseTypableElement(abstractIntLiteral);
				if (result == null) result = caseControlFlowElement(abstractIntLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.INT_LITERAL: {
				IntLiteral intLiteral = (IntLiteral)theEObject;
				T1 result = caseIntLiteral(intLiteral);
				if (result == null) result = caseAbstractIntLiteral(intLiteral);
				if (result == null) result = caseNumericLiteral(intLiteral);
				if (result == null) result = caseLiteral(intLiteral);
				if (result == null) result = casePrimaryExpression(intLiteral);
				if (result == null) result = caseExpression(intLiteral);
				if (result == null) result = caseTypableElement(intLiteral);
				if (result == null) result = caseControlFlowElement(intLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.BINARY_INT_LITERAL: {
				BinaryIntLiteral binaryIntLiteral = (BinaryIntLiteral)theEObject;
				T1 result = caseBinaryIntLiteral(binaryIntLiteral);
				if (result == null) result = caseAbstractIntLiteral(binaryIntLiteral);
				if (result == null) result = caseNumericLiteral(binaryIntLiteral);
				if (result == null) result = caseLiteral(binaryIntLiteral);
				if (result == null) result = casePrimaryExpression(binaryIntLiteral);
				if (result == null) result = caseExpression(binaryIntLiteral);
				if (result == null) result = caseTypableElement(binaryIntLiteral);
				if (result == null) result = caseControlFlowElement(binaryIntLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.OCTAL_INT_LITERAL: {
				OctalIntLiteral octalIntLiteral = (OctalIntLiteral)theEObject;
				T1 result = caseOctalIntLiteral(octalIntLiteral);
				if (result == null) result = caseAbstractIntLiteral(octalIntLiteral);
				if (result == null) result = caseNumericLiteral(octalIntLiteral);
				if (result == null) result = caseLiteral(octalIntLiteral);
				if (result == null) result = casePrimaryExpression(octalIntLiteral);
				if (result == null) result = caseExpression(octalIntLiteral);
				if (result == null) result = caseTypableElement(octalIntLiteral);
				if (result == null) result = caseControlFlowElement(octalIntLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.LEGACY_OCTAL_INT_LITERAL: {
				LegacyOctalIntLiteral legacyOctalIntLiteral = (LegacyOctalIntLiteral)theEObject;
				T1 result = caseLegacyOctalIntLiteral(legacyOctalIntLiteral);
				if (result == null) result = caseAbstractIntLiteral(legacyOctalIntLiteral);
				if (result == null) result = caseNumericLiteral(legacyOctalIntLiteral);
				if (result == null) result = caseLiteral(legacyOctalIntLiteral);
				if (result == null) result = casePrimaryExpression(legacyOctalIntLiteral);
				if (result == null) result = caseExpression(legacyOctalIntLiteral);
				if (result == null) result = caseTypableElement(legacyOctalIntLiteral);
				if (result == null) result = caseControlFlowElement(legacyOctalIntLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.HEX_INT_LITERAL: {
				HexIntLiteral hexIntLiteral = (HexIntLiteral)theEObject;
				T1 result = caseHexIntLiteral(hexIntLiteral);
				if (result == null) result = caseAbstractIntLiteral(hexIntLiteral);
				if (result == null) result = caseNumericLiteral(hexIntLiteral);
				if (result == null) result = caseLiteral(hexIntLiteral);
				if (result == null) result = casePrimaryExpression(hexIntLiteral);
				if (result == null) result = caseExpression(hexIntLiteral);
				if (result == null) result = caseTypableElement(hexIntLiteral);
				if (result == null) result = caseControlFlowElement(hexIntLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.SCIENTIFIC_INT_LITERAL: {
				ScientificIntLiteral scientificIntLiteral = (ScientificIntLiteral)theEObject;
				T1 result = caseScientificIntLiteral(scientificIntLiteral);
				if (result == null) result = caseAbstractIntLiteral(scientificIntLiteral);
				if (result == null) result = caseNumericLiteral(scientificIntLiteral);
				if (result == null) result = caseLiteral(scientificIntLiteral);
				if (result == null) result = casePrimaryExpression(scientificIntLiteral);
				if (result == null) result = caseExpression(scientificIntLiteral);
				if (result == null) result = caseTypableElement(scientificIntLiteral);
				if (result == null) result = caseControlFlowElement(scientificIntLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.REGULAR_EXPRESSION_LITERAL: {
				RegularExpressionLiteral regularExpressionLiteral = (RegularExpressionLiteral)theEObject;
				T1 result = caseRegularExpressionLiteral(regularExpressionLiteral);
				if (result == null) result = caseLiteral(regularExpressionLiteral);
				if (result == null) result = casePrimaryExpression(regularExpressionLiteral);
				if (result == null) result = caseExpression(regularExpressionLiteral);
				if (result == null) result = caseTypableElement(regularExpressionLiteral);
				if (result == null) result = caseControlFlowElement(regularExpressionLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.POSTFIX_EXPRESSION: {
				PostfixExpression postfixExpression = (PostfixExpression)theEObject;
				T1 result = casePostfixExpression(postfixExpression);
				if (result == null) result = caseExpression(postfixExpression);
				if (result == null) result = caseTypableElement(postfixExpression);
				if (result == null) result = caseControlFlowElement(postfixExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.UNARY_EXPRESSION: {
				UnaryExpression unaryExpression = (UnaryExpression)theEObject;
				T1 result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseExpression(unaryExpression);
				if (result == null) result = caseTypableElement(unaryExpression);
				if (result == null) result = caseControlFlowElement(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.CAST_EXPRESSION: {
				CastExpression castExpression = (CastExpression)theEObject;
				T1 result = caseCastExpression(castExpression);
				if (result == null) result = caseExpression(castExpression);
				if (result == null) result = caseTypableElement(castExpression);
				if (result == null) result = caseControlFlowElement(castExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.MULTIPLICATIVE_EXPRESSION: {
				MultiplicativeExpression multiplicativeExpression = (MultiplicativeExpression)theEObject;
				T1 result = caseMultiplicativeExpression(multiplicativeExpression);
				if (result == null) result = caseExpression(multiplicativeExpression);
				if (result == null) result = caseTypableElement(multiplicativeExpression);
				if (result == null) result = caseControlFlowElement(multiplicativeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ADDITIVE_EXPRESSION: {
				AdditiveExpression additiveExpression = (AdditiveExpression)theEObject;
				T1 result = caseAdditiveExpression(additiveExpression);
				if (result == null) result = caseExpression(additiveExpression);
				if (result == null) result = caseTypableElement(additiveExpression);
				if (result == null) result = caseControlFlowElement(additiveExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.SHIFT_EXPRESSION: {
				ShiftExpression shiftExpression = (ShiftExpression)theEObject;
				T1 result = caseShiftExpression(shiftExpression);
				if (result == null) result = caseExpression(shiftExpression);
				if (result == null) result = caseTypableElement(shiftExpression);
				if (result == null) result = caseControlFlowElement(shiftExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.RELATIONAL_EXPRESSION: {
				RelationalExpression relationalExpression = (RelationalExpression)theEObject;
				T1 result = caseRelationalExpression(relationalExpression);
				if (result == null) result = caseExpression(relationalExpression);
				if (result == null) result = caseTypableElement(relationalExpression);
				if (result == null) result = caseControlFlowElement(relationalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.EQUALITY_EXPRESSION: {
				EqualityExpression equalityExpression = (EqualityExpression)theEObject;
				T1 result = caseEqualityExpression(equalityExpression);
				if (result == null) result = caseExpression(equalityExpression);
				if (result == null) result = caseTypableElement(equalityExpression);
				if (result == null) result = caseControlFlowElement(equalityExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.BINARY_BITWISE_EXPRESSION: {
				BinaryBitwiseExpression binaryBitwiseExpression = (BinaryBitwiseExpression)theEObject;
				T1 result = caseBinaryBitwiseExpression(binaryBitwiseExpression);
				if (result == null) result = caseExpression(binaryBitwiseExpression);
				if (result == null) result = caseTypableElement(binaryBitwiseExpression);
				if (result == null) result = caseControlFlowElement(binaryBitwiseExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.BINARY_LOGICAL_EXPRESSION: {
				BinaryLogicalExpression binaryLogicalExpression = (BinaryLogicalExpression)theEObject;
				T1 result = caseBinaryLogicalExpression(binaryLogicalExpression);
				if (result == null) result = caseExpression(binaryLogicalExpression);
				if (result == null) result = caseTypableElement(binaryLogicalExpression);
				if (result == null) result = caseControlFlowElement(binaryLogicalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.COALESCE_EXPRESSION: {
				CoalesceExpression coalesceExpression = (CoalesceExpression)theEObject;
				T1 result = caseCoalesceExpression(coalesceExpression);
				if (result == null) result = caseExpression(coalesceExpression);
				if (result == null) result = caseTypableElement(coalesceExpression);
				if (result == null) result = caseControlFlowElement(coalesceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.CONDITIONAL_EXPRESSION: {
				ConditionalExpression conditionalExpression = (ConditionalExpression)theEObject;
				T1 result = caseConditionalExpression(conditionalExpression);
				if (result == null) result = caseExpression(conditionalExpression);
				if (result == null) result = caseTypableElement(conditionalExpression);
				if (result == null) result = caseControlFlowElement(conditionalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ASSIGNMENT_EXPRESSION: {
				AssignmentExpression assignmentExpression = (AssignmentExpression)theEObject;
				T1 result = caseAssignmentExpression(assignmentExpression);
				if (result == null) result = caseExpression(assignmentExpression);
				if (result == null) result = caseTypableElement(assignmentExpression);
				if (result == null) result = caseControlFlowElement(assignmentExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.COMMA_EXPRESSION: {
				CommaExpression commaExpression = (CommaExpression)theEObject;
				T1 result = caseCommaExpression(commaExpression);
				if (result == null) result = caseExpression(commaExpression);
				if (result == null) result = caseTypableElement(commaExpression);
				if (result == null) result = caseControlFlowElement(commaExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.TYPE_DEFINING_ELEMENT: {
				TypeDefiningElement typeDefiningElement = (TypeDefiningElement)theEObject;
				T1 result = caseTypeDefiningElement(typeDefiningElement);
				if (result == null) result = caseTypableElement(typeDefiningElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.GENERIC_DECLARATION: {
				GenericDeclaration genericDeclaration = (GenericDeclaration)theEObject;
				T1 result = caseGenericDeclaration(genericDeclaration);
				if (result == null) result = caseTypeDefiningElement(genericDeclaration);
				if (result == null) result = caseTypableElement(genericDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.N4_TYPE_VARIABLE: {
				N4TypeVariable n4TypeVariable = (N4TypeVariable)theEObject;
				T1 result = caseN4TypeVariable(n4TypeVariable);
				if (result == null) result = caseIdentifiableElement(n4TypeVariable);
				if (result == null) result = caseNamedElement(n4TypeVariable);
				if (result == null) result = caseTypableElement(n4TypeVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.N4_TYPE_DEFINITION: {
				N4TypeDefinition n4TypeDefinition = (N4TypeDefinition)theEObject;
				T1 result = caseN4TypeDefinition(n4TypeDefinition);
				if (result == null) result = caseAnnotableElement(n4TypeDefinition);
				if (result == null) result = caseTypeDefiningElement(n4TypeDefinition);
				if (result == null) result = caseTypableElement(n4TypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.N4_TYPE_DECLARATION: {
				N4TypeDeclaration n4TypeDeclaration = (N4TypeDeclaration)theEObject;
				T1 result = caseN4TypeDeclaration(n4TypeDeclaration);
				if (result == null) result = caseN4TypeDefinition(n4TypeDeclaration);
				if (result == null) result = caseAnnotableScriptElement(n4TypeDeclaration);
				if (result == null) result = caseModifiableElement(n4TypeDeclaration);
				if (result == null) result = caseExportableElement(n4TypeDeclaration);
				if (result == null) result = caseNamedElement(n4TypeDeclaration);
				if (result == null) result = caseAnnotableElement(n4TypeDeclaration);
				if (result == null) result = caseTypeDefiningElement(n4TypeDeclaration);
				if (result == null) result = caseScriptElement(n4TypeDeclaration);
				if (result == null) result = caseTypableElement(n4TypeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.N4_CLASSIFIER_DECLARATION: {
				N4ClassifierDeclaration n4ClassifierDeclaration = (N4ClassifierDeclaration)theEObject;
				T1 result = caseN4ClassifierDeclaration(n4ClassifierDeclaration);
				if (result == null) result = caseN4TypeDeclaration(n4ClassifierDeclaration);
				if (result == null) result = caseN4ClassifierDefinition(n4ClassifierDeclaration);
				if (result == null) result = caseGenericDeclaration(n4ClassifierDeclaration);
				if (result == null) result = caseThisTarget(n4ClassifierDeclaration);
				if (result == null) result = caseN4TypeDefinition(n4ClassifierDeclaration);
				if (result == null) result = caseAnnotableScriptElement(n4ClassifierDeclaration);
				if (result == null) result = caseModifiableElement(n4ClassifierDeclaration);
				if (result == null) result = caseExportableElement(n4ClassifierDeclaration);
				if (result == null) result = caseNamedElement(n4ClassifierDeclaration);
				if (result == null) result = caseAnnotableElement(n4ClassifierDeclaration);
				if (result == null) result = caseTypeDefiningElement(n4ClassifierDeclaration);
				if (result == null) result = caseScriptElement(n4ClassifierDeclaration);
				if (result == null) result = caseTypableElement(n4ClassifierDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.N4_CLASSIFIER_DEFINITION: {
				N4ClassifierDefinition n4ClassifierDefinition = (N4ClassifierDefinition)theEObject;
				T1 result = caseN4ClassifierDefinition(n4ClassifierDefinition);
				if (result == null) result = caseN4TypeDefinition(n4ClassifierDefinition);
				if (result == null) result = caseAnnotableElement(n4ClassifierDefinition);
				if (result == null) result = caseTypeDefiningElement(n4ClassifierDefinition);
				if (result == null) result = caseTypableElement(n4ClassifierDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.N4_CLASS_DEFINITION: {
				N4ClassDefinition n4ClassDefinition = (N4ClassDefinition)theEObject;
				T1 result = caseN4ClassDefinition(n4ClassDefinition);
				if (result == null) result = caseN4ClassifierDefinition(n4ClassDefinition);
				if (result == null) result = caseThisTarget(n4ClassDefinition);
				if (result == null) result = caseN4TypeDefinition(n4ClassDefinition);
				if (result == null) result = caseAnnotableElement(n4ClassDefinition);
				if (result == null) result = caseTypeDefiningElement(n4ClassDefinition);
				if (result == null) result = caseTypableElement(n4ClassDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.N4_CLASS_DECLARATION: {
				N4ClassDeclaration n4ClassDeclaration = (N4ClassDeclaration)theEObject;
				T1 result = caseN4ClassDeclaration(n4ClassDeclaration);
				if (result == null) result = caseN4ClassDefinition(n4ClassDeclaration);
				if (result == null) result = caseN4ClassifierDeclaration(n4ClassDeclaration);
				if (result == null) result = caseVersionable(n4ClassDeclaration);
				if (result == null) result = caseVersionedElement(n4ClassDeclaration);
				if (result == null) result = caseN4ClassifierDefinition(n4ClassDeclaration);
				if (result == null) result = caseThisTarget(n4ClassDeclaration);
				if (result == null) result = caseN4TypeDeclaration(n4ClassDeclaration);
				if (result == null) result = caseGenericDeclaration(n4ClassDeclaration);
				if (result == null) result = caseN4TypeDefinition(n4ClassDeclaration);
				if (result == null) result = caseAnnotableScriptElement(n4ClassDeclaration);
				if (result == null) result = caseModifiableElement(n4ClassDeclaration);
				if (result == null) result = caseExportableElement(n4ClassDeclaration);
				if (result == null) result = caseNamedElement(n4ClassDeclaration);
				if (result == null) result = caseAnnotableElement(n4ClassDeclaration);
				if (result == null) result = caseTypeDefiningElement(n4ClassDeclaration);
				if (result == null) result = caseScriptElement(n4ClassDeclaration);
				if (result == null) result = caseTypableElement(n4ClassDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.N4_CLASS_EXPRESSION: {
				N4ClassExpression n4ClassExpression = (N4ClassExpression)theEObject;
				T1 result = caseN4ClassExpression(n4ClassExpression);
				if (result == null) result = caseN4ClassDefinition(n4ClassExpression);
				if (result == null) result = casePrimaryExpression(n4ClassExpression);
				if (result == null) result = caseAnnotableExpression(n4ClassExpression);
				if (result == null) result = caseNamedElement(n4ClassExpression);
				if (result == null) result = caseN4ClassifierDefinition(n4ClassExpression);
				if (result == null) result = caseThisTarget(n4ClassExpression);
				if (result == null) result = caseExpression(n4ClassExpression);
				if (result == null) result = caseN4TypeDefinition(n4ClassExpression);
				if (result == null) result = caseControlFlowElement(n4ClassExpression);
				if (result == null) result = caseAnnotableElement(n4ClassExpression);
				if (result == null) result = caseTypeDefiningElement(n4ClassExpression);
				if (result == null) result = caseTypableElement(n4ClassExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.N4_INTERFACE_DECLARATION: {
				N4InterfaceDeclaration n4InterfaceDeclaration = (N4InterfaceDeclaration)theEObject;
				T1 result = caseN4InterfaceDeclaration(n4InterfaceDeclaration);
				if (result == null) result = caseN4ClassifierDeclaration(n4InterfaceDeclaration);
				if (result == null) result = caseVersionable(n4InterfaceDeclaration);
				if (result == null) result = caseVersionedElement(n4InterfaceDeclaration);
				if (result == null) result = caseN4TypeDeclaration(n4InterfaceDeclaration);
				if (result == null) result = caseN4ClassifierDefinition(n4InterfaceDeclaration);
				if (result == null) result = caseGenericDeclaration(n4InterfaceDeclaration);
				if (result == null) result = caseThisTarget(n4InterfaceDeclaration);
				if (result == null) result = caseN4TypeDefinition(n4InterfaceDeclaration);
				if (result == null) result = caseAnnotableScriptElement(n4InterfaceDeclaration);
				if (result == null) result = caseModifiableElement(n4InterfaceDeclaration);
				if (result == null) result = caseExportableElement(n4InterfaceDeclaration);
				if (result == null) result = caseNamedElement(n4InterfaceDeclaration);
				if (result == null) result = caseAnnotableElement(n4InterfaceDeclaration);
				if (result == null) result = caseTypeDefiningElement(n4InterfaceDeclaration);
				if (result == null) result = caseScriptElement(n4InterfaceDeclaration);
				if (result == null) result = caseTypableElement(n4InterfaceDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.N4_ENUM_DECLARATION: {
				N4EnumDeclaration n4EnumDeclaration = (N4EnumDeclaration)theEObject;
				T1 result = caseN4EnumDeclaration(n4EnumDeclaration);
				if (result == null) result = caseN4TypeDeclaration(n4EnumDeclaration);
				if (result == null) result = caseVersionable(n4EnumDeclaration);
				if (result == null) result = caseVersionedElement(n4EnumDeclaration);
				if (result == null) result = caseN4TypeDefinition(n4EnumDeclaration);
				if (result == null) result = caseAnnotableScriptElement(n4EnumDeclaration);
				if (result == null) result = caseModifiableElement(n4EnumDeclaration);
				if (result == null) result = caseExportableElement(n4EnumDeclaration);
				if (result == null) result = caseNamedElement(n4EnumDeclaration);
				if (result == null) result = caseAnnotableElement(n4EnumDeclaration);
				if (result == null) result = caseTypeDefiningElement(n4EnumDeclaration);
				if (result == null) result = caseScriptElement(n4EnumDeclaration);
				if (result == null) result = caseTypableElement(n4EnumDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.N4_ENUM_LITERAL: {
				N4EnumLiteral n4EnumLiteral = (N4EnumLiteral)theEObject;
				T1 result = caseN4EnumLiteral(n4EnumLiteral);
				if (result == null) result = caseNamedElement(n4EnumLiteral);
				if (result == null) result = caseTypableElement(n4EnumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.N4_TYPE_ALIAS_DECLARATION: {
				N4TypeAliasDeclaration n4TypeAliasDeclaration = (N4TypeAliasDeclaration)theEObject;
				T1 result = caseN4TypeAliasDeclaration(n4TypeAliasDeclaration);
				if (result == null) result = caseN4TypeDeclaration(n4TypeAliasDeclaration);
				if (result == null) result = caseGenericDeclaration(n4TypeAliasDeclaration);
				if (result == null) result = caseTypedElement(n4TypeAliasDeclaration);
				if (result == null) result = caseN4TypeDefinition(n4TypeAliasDeclaration);
				if (result == null) result = caseAnnotableScriptElement(n4TypeAliasDeclaration);
				if (result == null) result = caseModifiableElement(n4TypeAliasDeclaration);
				if (result == null) result = caseExportableElement(n4TypeAliasDeclaration);
				if (result == null) result = caseNamedElement(n4TypeAliasDeclaration);
				if (result == null) result = caseTypeProvidingElement(n4TypeAliasDeclaration);
				if (result == null) result = caseAnnotableElement(n4TypeAliasDeclaration);
				if (result == null) result = caseTypeDefiningElement(n4TypeAliasDeclaration);
				if (result == null) result = caseScriptElement(n4TypeAliasDeclaration);
				if (result == null) result = caseTypableElement(n4TypeAliasDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.MODIFIABLE_ELEMENT: {
				ModifiableElement modifiableElement = (ModifiableElement)theEObject;
				T1 result = caseModifiableElement(modifiableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.N4_MEMBER_DECLARATION: {
				N4MemberDeclaration n4MemberDeclaration = (N4MemberDeclaration)theEObject;
				T1 result = caseN4MemberDeclaration(n4MemberDeclaration);
				if (result == null) result = caseAnnotableElement(n4MemberDeclaration);
				if (result == null) result = caseModifiableElement(n4MemberDeclaration);
				if (result == null) result = caseTypableElement(n4MemberDeclaration);
				if (result == null) result = caseNamedElement(n4MemberDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ANNOTABLE_N4_MEMBER_DECLARATION: {
				AnnotableN4MemberDeclaration annotableN4MemberDeclaration = (AnnotableN4MemberDeclaration)theEObject;
				T1 result = caseAnnotableN4MemberDeclaration(annotableN4MemberDeclaration);
				if (result == null) result = caseN4MemberDeclaration(annotableN4MemberDeclaration);
				if (result == null) result = caseAnnotableElement(annotableN4MemberDeclaration);
				if (result == null) result = caseModifiableElement(annotableN4MemberDeclaration);
				if (result == null) result = caseTypableElement(annotableN4MemberDeclaration);
				if (result == null) result = caseNamedElement(annotableN4MemberDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.N4_MEMBER_ANNOTATION_LIST: {
				N4MemberAnnotationList n4MemberAnnotationList = (N4MemberAnnotationList)theEObject;
				T1 result = caseN4MemberAnnotationList(n4MemberAnnotationList);
				if (result == null) result = caseAbstractAnnotationList(n4MemberAnnotationList);
				if (result == null) result = caseN4MemberDeclaration(n4MemberAnnotationList);
				if (result == null) result = caseAnnotableElement(n4MemberAnnotationList);
				if (result == null) result = caseModifiableElement(n4MemberAnnotationList);
				if (result == null) result = caseTypableElement(n4MemberAnnotationList);
				if (result == null) result = caseNamedElement(n4MemberAnnotationList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.N4_FIELD_DECLARATION: {
				N4FieldDeclaration n4FieldDeclaration = (N4FieldDeclaration)theEObject;
				T1 result = caseN4FieldDeclaration(n4FieldDeclaration);
				if (result == null) result = caseAnnotableN4MemberDeclaration(n4FieldDeclaration);
				if (result == null) result = caseTypedElement(n4FieldDeclaration);
				if (result == null) result = caseThisArgProvider(n4FieldDeclaration);
				if (result == null) result = casePropertyNameOwner(n4FieldDeclaration);
				if (result == null) result = caseN4MemberDeclaration(n4FieldDeclaration);
				if (result == null) result = caseTypeProvidingElement(n4FieldDeclaration);
				if (result == null) result = caseAnnotableElement(n4FieldDeclaration);
				if (result == null) result = caseModifiableElement(n4FieldDeclaration);
				if (result == null) result = caseTypableElement(n4FieldDeclaration);
				if (result == null) result = caseNamedElement(n4FieldDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.METHOD_DECLARATION: {
				MethodDeclaration methodDeclaration = (MethodDeclaration)theEObject;
				T1 result = caseMethodDeclaration(methodDeclaration);
				if (result == null) result = caseFunctionDefinition(methodDeclaration);
				if (result == null) result = caseGenericDeclaration(methodDeclaration);
				if (result == null) result = casePropertyNameOwner(methodDeclaration);
				if (result == null) result = caseFunctionOrFieldAccessor(methodDeclaration);
				if (result == null) result = caseTypeDefiningElement(methodDeclaration);
				if (result == null) result = caseVersionedElement(methodDeclaration);
				if (result == null) result = caseNamedElement(methodDeclaration);
				if (result == null) result = caseAnnotableElement(methodDeclaration);
				if (result == null) result = caseVariableEnvironmentElement(methodDeclaration);
				if (result == null) result = caseThisArgProvider(methodDeclaration);
				if (result == null) result = caseTypableElement(methodDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.N4_METHOD_DECLARATION: {
				N4MethodDeclaration n4MethodDeclaration = (N4MethodDeclaration)theEObject;
				T1 result = caseN4MethodDeclaration(n4MethodDeclaration);
				if (result == null) result = caseAnnotableN4MemberDeclaration(n4MethodDeclaration);
				if (result == null) result = caseMethodDeclaration(n4MethodDeclaration);
				if (result == null) result = caseN4MemberDeclaration(n4MethodDeclaration);
				if (result == null) result = caseFunctionDefinition(n4MethodDeclaration);
				if (result == null) result = caseGenericDeclaration(n4MethodDeclaration);
				if (result == null) result = casePropertyNameOwner(n4MethodDeclaration);
				if (result == null) result = caseModifiableElement(n4MethodDeclaration);
				if (result == null) result = caseNamedElement(n4MethodDeclaration);
				if (result == null) result = caseFunctionOrFieldAccessor(n4MethodDeclaration);
				if (result == null) result = caseTypeDefiningElement(n4MethodDeclaration);
				if (result == null) result = caseVersionedElement(n4MethodDeclaration);
				if (result == null) result = caseAnnotableElement(n4MethodDeclaration);
				if (result == null) result = caseTypableElement(n4MethodDeclaration);
				if (result == null) result = caseVariableEnvironmentElement(n4MethodDeclaration);
				if (result == null) result = caseThisArgProvider(n4MethodDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.N4_FIELD_ACCESSOR: {
				N4FieldAccessor n4FieldAccessor = (N4FieldAccessor)theEObject;
				T1 result = caseN4FieldAccessor(n4FieldAccessor);
				if (result == null) result = caseAnnotableN4MemberDeclaration(n4FieldAccessor);
				if (result == null) result = caseFieldAccessor(n4FieldAccessor);
				if (result == null) result = caseN4MemberDeclaration(n4FieldAccessor);
				if (result == null) result = caseFunctionOrFieldAccessor(n4FieldAccessor);
				if (result == null) result = caseTypeProvidingElement(n4FieldAccessor);
				if (result == null) result = casePropertyNameOwner(n4FieldAccessor);
				if (result == null) result = caseAnnotableElement(n4FieldAccessor);
				if (result == null) result = caseModifiableElement(n4FieldAccessor);
				if (result == null) result = caseTypableElement(n4FieldAccessor);
				if (result == null) result = caseNamedElement(n4FieldAccessor);
				if (result == null) result = caseVariableEnvironmentElement(n4FieldAccessor);
				if (result == null) result = caseThisArgProvider(n4FieldAccessor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.N4_GETTER_DECLARATION: {
				N4GetterDeclaration n4GetterDeclaration = (N4GetterDeclaration)theEObject;
				T1 result = caseN4GetterDeclaration(n4GetterDeclaration);
				if (result == null) result = caseGetterDeclaration(n4GetterDeclaration);
				if (result == null) result = caseN4FieldAccessor(n4GetterDeclaration);
				if (result == null) result = caseFieldAccessor(n4GetterDeclaration);
				if (result == null) result = caseTypedElement(n4GetterDeclaration);
				if (result == null) result = caseAnnotableN4MemberDeclaration(n4GetterDeclaration);
				if (result == null) result = caseFunctionOrFieldAccessor(n4GetterDeclaration);
				if (result == null) result = caseTypeProvidingElement(n4GetterDeclaration);
				if (result == null) result = casePropertyNameOwner(n4GetterDeclaration);
				if (result == null) result = caseN4MemberDeclaration(n4GetterDeclaration);
				if (result == null) result = caseAnnotableElement(n4GetterDeclaration);
				if (result == null) result = caseVariableEnvironmentElement(n4GetterDeclaration);
				if (result == null) result = caseThisArgProvider(n4GetterDeclaration);
				if (result == null) result = caseTypableElement(n4GetterDeclaration);
				if (result == null) result = caseNamedElement(n4GetterDeclaration);
				if (result == null) result = caseModifiableElement(n4GetterDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.N4_SETTER_DECLARATION: {
				N4SetterDeclaration n4SetterDeclaration = (N4SetterDeclaration)theEObject;
				T1 result = caseN4SetterDeclaration(n4SetterDeclaration);
				if (result == null) result = caseSetterDeclaration(n4SetterDeclaration);
				if (result == null) result = caseN4FieldAccessor(n4SetterDeclaration);
				if (result == null) result = caseFieldAccessor(n4SetterDeclaration);
				if (result == null) result = caseAnnotableN4MemberDeclaration(n4SetterDeclaration);
				if (result == null) result = caseFunctionOrFieldAccessor(n4SetterDeclaration);
				if (result == null) result = caseTypeProvidingElement(n4SetterDeclaration);
				if (result == null) result = casePropertyNameOwner(n4SetterDeclaration);
				if (result == null) result = caseN4MemberDeclaration(n4SetterDeclaration);
				if (result == null) result = caseAnnotableElement(n4SetterDeclaration);
				if (result == null) result = caseVariableEnvironmentElement(n4SetterDeclaration);
				if (result == null) result = caseThisArgProvider(n4SetterDeclaration);
				if (result == null) result = caseTypableElement(n4SetterDeclaration);
				if (result == null) result = caseNamedElement(n4SetterDeclaration);
				if (result == null) result = caseModifiableElement(n4SetterDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.BINDING_PATTERN: {
				BindingPattern bindingPattern = (BindingPattern)theEObject;
				T1 result = caseBindingPattern(bindingPattern);
				if (result == null) result = caseControlFlowElement(bindingPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.OBJECT_BINDING_PATTERN: {
				ObjectBindingPattern objectBindingPattern = (ObjectBindingPattern)theEObject;
				T1 result = caseObjectBindingPattern(objectBindingPattern);
				if (result == null) result = caseBindingPattern(objectBindingPattern);
				if (result == null) result = caseControlFlowElement(objectBindingPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.ARRAY_BINDING_PATTERN: {
				ArrayBindingPattern arrayBindingPattern = (ArrayBindingPattern)theEObject;
				T1 result = caseArrayBindingPattern(arrayBindingPattern);
				if (result == null) result = caseBindingPattern(arrayBindingPattern);
				if (result == null) result = caseControlFlowElement(arrayBindingPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.BINDING_PROPERTY: {
				BindingProperty bindingProperty = (BindingProperty)theEObject;
				T1 result = caseBindingProperty(bindingProperty);
				if (result == null) result = casePropertyNameOwner(bindingProperty);
				if (result == null) result = caseNamedElement(bindingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.BINDING_ELEMENT: {
				BindingElement bindingElement = (BindingElement)theEObject;
				T1 result = caseBindingElement(bindingElement);
				if (result == null) result = caseControlFlowElement(bindingElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.JSX_CHILD: {
				JSXChild jsxChild = (JSXChild)theEObject;
				T1 result = caseJSXChild(jsxChild);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.JSX_ELEMENT_NAME: {
				JSXElementName jsxElementName = (JSXElementName)theEObject;
				T1 result = caseJSXElementName(jsxElementName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.JSX_TEXT: {
				JSXText jsxText = (JSXText)theEObject;
				T1 result = caseJSXText(jsxText);
				if (result == null) result = caseJSXChild(jsxText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.JSX_EXPRESSION: {
				JSXExpression jsxExpression = (JSXExpression)theEObject;
				T1 result = caseJSXExpression(jsxExpression);
				if (result == null) result = caseJSXChild(jsxExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.JSX_ATTRIBUTE: {
				JSXAttribute jsxAttribute = (JSXAttribute)theEObject;
				T1 result = caseJSXAttribute(jsxAttribute);
				if (result == null) result = caseControlFlowElement(jsxAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.JSX_PROPERTY_ATTRIBUTE: {
				JSXPropertyAttribute jsxPropertyAttribute = (JSXPropertyAttribute)theEObject;
				T1 result = caseJSXPropertyAttribute(jsxPropertyAttribute);
				if (result == null) result = caseJSXAttribute(jsxPropertyAttribute);
				if (result == null) result = caseMemberAccess(jsxPropertyAttribute);
				if (result == null) result = caseControlFlowElement(jsxPropertyAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.JSX_SPREAD_ATTRIBUTE: {
				JSXSpreadAttribute jsxSpreadAttribute = (JSXSpreadAttribute)theEObject;
				T1 result = caseJSXSpreadAttribute(jsxSpreadAttribute);
				if (result == null) result = caseJSXAttribute(jsxSpreadAttribute);
				if (result == null) result = caseControlFlowElement(jsxSpreadAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.JSX_ABSTRACT_ELEMENT: {
				JSXAbstractElement jsxAbstractElement = (JSXAbstractElement)theEObject;
				T1 result = caseJSXAbstractElement(jsxAbstractElement);
				if (result == null) result = caseExpression(jsxAbstractElement);
				if (result == null) result = caseTypableElement(jsxAbstractElement);
				if (result == null) result = caseControlFlowElement(jsxAbstractElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.JSX_ELEMENT: {
				JSXElement jsxElement = (JSXElement)theEObject;
				T1 result = caseJSXElement(jsxElement);
				if (result == null) result = caseJSXChild(jsxElement);
				if (result == null) result = caseJSXAbstractElement(jsxElement);
				if (result == null) result = caseExpression(jsxElement);
				if (result == null) result = caseTypableElement(jsxElement);
				if (result == null) result = caseControlFlowElement(jsxElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.JSX_FRAGMENT: {
				JSXFragment jsxFragment = (JSXFragment)theEObject;
				T1 result = caseJSXFragment(jsxFragment);
				if (result == null) result = caseJSXChild(jsxFragment);
				if (result == null) result = caseJSXAbstractElement(jsxFragment);
				if (result == null) result = caseExpression(jsxFragment);
				if (result == null) result = caseTypableElement(jsxFragment);
				if (result == null) result = caseControlFlowElement(jsxFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.VERSIONED_ELEMENT: {
				VersionedElement versionedElement = (VersionedElement)theEObject;
				T1 result = caseVersionedElement(versionedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.VERSIONED_IDENTIFIER_REF: {
				VersionedIdentifierRef versionedIdentifierRef = (VersionedIdentifierRef)theEObject;
				T1 result = caseVersionedIdentifierRef(versionedIdentifierRef);
				if (result == null) result = caseIdentifierRef(versionedIdentifierRef);
				if (result == null) result = caseVersionedReference(versionedIdentifierRef);
				if (result == null) result = casePrimaryExpression(versionedIdentifierRef);
				if (result == null) result = caseStrictModeRelevant(versionedIdentifierRef);
				if (result == null) result = caseVersionable(versionedIdentifierRef);
				if (result == null) result = caseExpression(versionedIdentifierRef);
				if (result == null) result = caseTypableElement(versionedIdentifierRef);
				if (result == null) result = caseControlFlowElement(versionedIdentifierRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case N4JSPackage.MIGRATION_CONTEXT_VARIABLE: {
				MigrationContextVariable migrationContextVariable = (MigrationContextVariable)theEObject;
				T1 result = caseMigrationContextVariable(migrationContextVariable);
				if (result == null) result = caseVariable(migrationContextVariable);
				if (result == null) result = caseTypedElement(migrationContextVariable);
				if (result == null) result = caseIdentifiableElement(migrationContextVariable);
				if (result == null) result = caseNamedElement(migrationContextVariable);
				if (result == null) result = caseTypeProvidingElement(migrationContextVariable);
				if (result == null) result = caseTypableElement(migrationContextVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Flow Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseControlFlowElement(ControlFlowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseScript(Script object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseScriptElement(ScriptElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExportDeclaration(ExportDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Export Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Export Specifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExportSpecifier(ExportSpecifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exportable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exportable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExportableElement(ExportableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseImportDeclaration(ImportDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Specifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseImportSpecifier(ImportSpecifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Import Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Import Specifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNamedImportSpecifier(NamedImportSpecifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Import Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Import Specifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDefaultImportSpecifier(DefaultImportSpecifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace Import Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace Import Specifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNamespaceImportSpecifier(NamespaceImportSpecifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reference Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reference Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends TypeRef> T1 caseTypeReferenceNode(TypeReferenceNode<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Providing Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Providing Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTypeProvidingElement(TypeProvidingElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Environment Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Environment Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableEnvironmentElement(VariableEnvironmentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>This Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>This Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseThisTarget(ThisTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>This Arg Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>This Arg Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseThisArgProvider(ThisArgProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAnnotableElement(AnnotableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotable Script Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotable Script Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAnnotableScriptElement(AnnotableScriptElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotable Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotable Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAnnotableExpression(AnnotableExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Annotation List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Annotation List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractAnnotationList(AbstractAnnotationList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAnnotationList(AnnotationList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Annotation List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Annotation List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExpressionAnnotationList(ExpressionAnnotationList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAnnotationArgument(AnnotationArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Annotation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Annotation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLiteralAnnotationArgument(LiteralAnnotationArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ref Annotation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ref Annotation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTypeRefAnnotationArgument(TypeRefAnnotationArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Or Field Accessor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Or Field Accessor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFunctionOrFieldAccessor(FunctionOrFieldAccessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFunctionDefinition(FunctionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Accessor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Accessor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFieldAccessor(FieldAccessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFunctionDeclaration(FunctionDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFunctionExpression(FunctionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrow Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrow Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArrowFunction(ArrowFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Arguments Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Arguments Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLocalArgumentsVariable(LocalArgumentsVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFormalParameter(FormalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableDeclarationContainer(VariableDeclarationContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableStatement(VariableStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exported Variable Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exported Variable Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExportedVariableStatement(ExportedVariableStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration Or Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration Or Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableDeclarationOrBinding(VariableDeclarationOrBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableBinding(VariableBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exported Variable Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exported Variable Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExportedVariableBinding(ExportedVariableBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exported Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exported Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExportedVariableDeclaration(ExportedVariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEmptyStatement(EmptyStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExpressionStatement(ExpressionStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIfStatement(IfStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iteration Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iteration Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIterationStatement(IterationStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDoStatement(DoStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseWhileStatement(WhileStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseForStatement(ForStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLabelRef(LabelRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continue Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseContinueStatement(ContinueStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Break Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Break Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBreakStatement(BreakStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseReturnStatement(ReturnStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>With Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>With Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseWithStatement(WithStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSwitchStatement(SwitchStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Case Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Case Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractCaseClause(AbstractCaseClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCaseClause(CaseClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDefaultClause(DefaultClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Labelled Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Labelled Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLabelledStatement(LabelledStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throw Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throw Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseThrowStatement(ThrowStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Try Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Try Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTryStatement(TryStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Catch Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Catch Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractCatchBlock(AbstractCatchBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCatchBlock(CatchBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catch Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catch Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCatchVariable(CatchVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finally Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finally Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFinallyBlock(FinallyBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Debugger Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Debugger Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDebuggerStatement(DebuggerStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePrimaryExpression(PrimaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paren Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paren Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseParenExpression(ParenExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIdentifierRef(IdentifierRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strict Mode Relevant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strict Mode Relevant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStrictModeRelevant(StrictModeRelevant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Super Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Super Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSuperLiteral(SuperLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>This Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>This Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseThisLiteral(ThisLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArrayLiteral(ArrayLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArrayElement(ArrayElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Padding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Padding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArrayPadding(ArrayPadding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseObjectLiteral(ObjectLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePropertyAssignment(PropertyAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Name Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Name Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePropertyNameOwner(PropertyNameOwner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Or Computed Property Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Or Computed Property Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLiteralOrComputedPropertyName(LiteralOrComputedPropertyName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotable Property Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotable Property Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAnnotablePropertyAssignment(AnnotablePropertyAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Assignment Annotation List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Assignment Annotation List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePropertyAssignmentAnnotationList(PropertyAssignmentAnnotationList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Name Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Name Value Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePropertyNameValuePair(PropertyNameValuePair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Name Value Pair Single Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Name Value Pair Single Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePropertyNameValuePairSingleName(PropertyNameValuePairSingleName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Method Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Method Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePropertyMethodDeclaration(PropertyMethodDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Getter Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Getter Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGetterDeclaration(GetterDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setter Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setter Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSetterDeclaration(SetterDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Getter Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Getter Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePropertyGetterDeclaration(PropertyGetterDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Setter Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Setter Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePropertySetterDeclaration(PropertySetterDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Spread</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Spread</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePropertySpread(PropertySpread object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNewTarget(NewTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNewExpression(NewExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseParameterizedAccess(ParameterizedAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression With Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression With Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseExpressionWithTarget(ExpressionWithTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Call Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseParameterizedCallExpression(ParameterizedCallExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Call Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Call Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseImportCallExpression(ImportCallExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArgument(Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indexed Access Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indexed Access Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIndexedAccessExpression(IndexedAccessExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tagged Template String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tagged Template String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTaggedTemplateString(TaggedTemplateString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMemberAccess(MemberAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterized Property Access Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterized Property Access Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseParameterizedPropertyAccessExpression(ParameterizedPropertyAccessExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Await Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Await Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAwaitExpression(AwaitExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Promisify Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Promisify Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePromisifyExpression(PromisifyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Yield Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Yield Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseYieldExpression(YieldExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNullLiteral(NullLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringLiteral(StringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTemplateLiteral(TemplateLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTemplateSegment(TemplateSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNumericLiteral(NumericLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDoubleLiteral(DoubleLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Int Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Int Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractIntLiteral(AbstractIntLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIntLiteral(IntLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Int Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Int Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryIntLiteral(BinaryIntLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Octal Int Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Octal Int Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOctalIntLiteral(OctalIntLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legacy Octal Int Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legacy Octal Int Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLegacyOctalIntLiteral(LegacyOctalIntLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hex Int Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hex Int Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseHexIntLiteral(HexIntLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scientific Int Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scientific Int Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseScientificIntLiteral(ScientificIntLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular Expression Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular Expression Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRegularExpressionLiteral(RegularExpressionLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postfix Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postfix Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePostfixExpression(PostfixExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCastExpression(CastExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicative Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicative Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMultiplicativeExpression(MultiplicativeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additive Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additive Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAdditiveExpression(AdditiveExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shift Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shift Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseShiftExpression(ShiftExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRelationalExpression(RelationalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equality Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEqualityExpression(EqualityExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Bitwise Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Bitwise Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryBitwiseExpression(BinaryBitwiseExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Logical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBinaryLogicalExpression(BinaryLogicalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coalesce Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coalesce Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCoalesceExpression(CoalesceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConditionalExpression(ConditionalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAssignmentExpression(AssignmentExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comma Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comma Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCommaExpression(CommaExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Defining Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Defining Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTypeDefiningElement(TypeDefiningElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGenericDeclaration(GenericDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>N4 Type Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>N4 Type Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseN4TypeVariable(N4TypeVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>N4 Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>N4 Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseN4TypeDefinition(N4TypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>N4 Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>N4 Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseN4TypeDeclaration(N4TypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>N4 Classifier Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>N4 Classifier Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseN4ClassifierDeclaration(N4ClassifierDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>N4 Classifier Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>N4 Classifier Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseN4ClassifierDefinition(N4ClassifierDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>N4 Class Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>N4 Class Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseN4ClassDefinition(N4ClassDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>N4 Class Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>N4 Class Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseN4ClassDeclaration(N4ClassDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>N4 Class Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>N4 Class Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseN4ClassExpression(N4ClassExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>N4 Interface Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>N4 Interface Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseN4InterfaceDeclaration(N4InterfaceDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>N4 Enum Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>N4 Enum Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseN4EnumDeclaration(N4EnumDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>N4 Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>N4 Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseN4EnumLiteral(N4EnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>N4 Type Alias Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>N4 Type Alias Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseN4TypeAliasDeclaration(N4TypeAliasDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifiable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifiable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseModifiableElement(ModifiableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>N4 Member Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>N4 Member Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseN4MemberDeclaration(N4MemberDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotable N4 Member Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotable N4 Member Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAnnotableN4MemberDeclaration(AnnotableN4MemberDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>N4 Member Annotation List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>N4 Member Annotation List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseN4MemberAnnotationList(N4MemberAnnotationList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>N4 Field Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>N4 Field Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseN4FieldDeclaration(N4FieldDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMethodDeclaration(MethodDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>N4 Method Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>N4 Method Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseN4MethodDeclaration(N4MethodDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>N4 Field Accessor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>N4 Field Accessor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseN4FieldAccessor(N4FieldAccessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>N4 Getter Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>N4 Getter Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseN4GetterDeclaration(N4GetterDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>N4 Setter Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>N4 Setter Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseN4SetterDeclaration(N4SetterDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBindingPattern(BindingPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Binding Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Binding Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseObjectBindingPattern(ObjectBindingPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Binding Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Binding Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseArrayBindingPattern(ArrayBindingPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBindingProperty(BindingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBindingElement(BindingElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSX Child</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSX Child</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJSXChild(JSXChild object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSX Element Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSX Element Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJSXElementName(JSXElementName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSX Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSX Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJSXText(JSXText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSX Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSX Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJSXExpression(JSXExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSX Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSX Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJSXAttribute(JSXAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSX Property Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSX Property Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJSXPropertyAttribute(JSXPropertyAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSX Spread Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSX Spread Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJSXSpreadAttribute(JSXSpreadAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSX Abstract Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSX Abstract Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJSXAbstractElement(JSXAbstractElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSX Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSX Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJSXElement(JSXElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSX Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSX Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseJSXFragment(JSXFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVersionedElement(VersionedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned Identifier Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned Identifier Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVersionedIdentifierRef(VersionedIdentifierRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Migration Context Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Migration Context Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMigrationContextVariable(MigrationContextVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTypableElement(TypableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIdentifiableElement(IdentifiableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versionable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versionable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVersionable(Versionable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versioned Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versioned Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseVersionedReference(VersionedReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //N4JSSwitch
