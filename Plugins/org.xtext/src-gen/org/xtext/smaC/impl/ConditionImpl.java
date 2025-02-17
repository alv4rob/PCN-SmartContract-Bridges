/**
 * generated by Xtext 2.34.0
 */
package org.xtext.smaC.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.smaC.Condition;
import org.xtext.smaC.Event;
import org.xtext.smaC.ForLoop;
import org.xtext.smaC.InputParam;
import org.xtext.smaC.Properties;
import org.xtext.smaC.RestrictionClause;
import org.xtext.smaC.SmaCPackage;
import org.xtext.smaC.UnDeterminedLoop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.smaC.impl.ConditionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.xtext.smaC.impl.ConditionImpl#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link org.xtext.smaC.impl.ConditionImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.xtext.smaC.impl.ConditionImpl#getExpressions <em>Expressions</em>}</li>
 *   <li>{@link org.xtext.smaC.impl.ConditionImpl#getConditionalExpr <em>Conditional Expr</em>}</li>
 *   <li>{@link org.xtext.smaC.impl.ConditionImpl#getUndeterminedloops <em>Undeterminedloops</em>}</li>
 *   <li>{@link org.xtext.smaC.impl.ConditionImpl#getDeterminedloops <em>Determinedloops</em>}</li>
 *   <li>{@link org.xtext.smaC.impl.ConditionImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.xtext.smaC.impl.ConditionImpl#getInputParamsEvent <em>Input Params Event</em>}</li>
 *   <li>{@link org.xtext.smaC.impl.ConditionImpl#getRestrictionElse <em>Restriction Else</em>}</li>
 *   <li>{@link org.xtext.smaC.impl.ConditionImpl#getPropertiesElse <em>Properties Else</em>}</li>
 *   <li>{@link org.xtext.smaC.impl.ConditionImpl#getExpressionsElse <em>Expressions Else</em>}</li>
 *   <li>{@link org.xtext.smaC.impl.ConditionImpl#getConditionalExprElse <em>Conditional Expr Else</em>}</li>
 *   <li>{@link org.xtext.smaC.impl.ConditionImpl#getUndeterminedloopsElse <em>Undeterminedloops Else</em>}</li>
 *   <li>{@link org.xtext.smaC.impl.ConditionImpl#getDeterminedloopsElse <em>Determinedloops Else</em>}</li>
 *   <li>{@link org.xtext.smaC.impl.ConditionImpl#getEventElse <em>Event Else</em>}</li>
 *   <li>{@link org.xtext.smaC.impl.ConditionImpl#getInputParamsEventElse <em>Input Params Event Else</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition
{
  /**
   * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected static final String CONDITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected String condition = CONDITION_EDEFAULT;

  /**
   * The cached value of the '{@link #getRestriction() <em>Restriction</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestriction()
   * @generated
   * @ordered
   */
  protected EList<RestrictionClause> restriction;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Properties> properties;

  /**
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected EList<String> expressions;

  /**
   * The cached value of the '{@link #getConditionalExpr() <em>Conditional Expr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionalExpr()
   * @generated
   * @ordered
   */
  protected EList<Condition> conditionalExpr;

  /**
   * The cached value of the '{@link #getUndeterminedloops() <em>Undeterminedloops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUndeterminedloops()
   * @generated
   * @ordered
   */
  protected EList<UnDeterminedLoop> undeterminedloops;

  /**
   * The cached value of the '{@link #getDeterminedloops() <em>Determinedloops</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeterminedloops()
   * @generated
   * @ordered
   */
  protected EList<ForLoop> determinedloops;

  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected EList<Event> event;

  /**
   * The cached value of the '{@link #getInputParamsEvent() <em>Input Params Event</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputParamsEvent()
   * @generated
   * @ordered
   */
  protected EList<InputParam> inputParamsEvent;

  /**
   * The cached value of the '{@link #getRestrictionElse() <em>Restriction Else</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRestrictionElse()
   * @generated
   * @ordered
   */
  protected EList<RestrictionClause> restrictionElse;

  /**
   * The cached value of the '{@link #getPropertiesElse() <em>Properties Else</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertiesElse()
   * @generated
   * @ordered
   */
  protected EList<Properties> propertiesElse;

  /**
   * The cached value of the '{@link #getExpressionsElse() <em>Expressions Else</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionsElse()
   * @generated
   * @ordered
   */
  protected EList<String> expressionsElse;

  /**
   * The cached value of the '{@link #getConditionalExprElse() <em>Conditional Expr Else</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionalExprElse()
   * @generated
   * @ordered
   */
  protected EList<Condition> conditionalExprElse;

  /**
   * The cached value of the '{@link #getUndeterminedloopsElse() <em>Undeterminedloops Else</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUndeterminedloopsElse()
   * @generated
   * @ordered
   */
  protected EList<UnDeterminedLoop> undeterminedloopsElse;

  /**
   * The cached value of the '{@link #getDeterminedloopsElse() <em>Determinedloops Else</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeterminedloopsElse()
   * @generated
   * @ordered
   */
  protected EList<ForLoop> determinedloopsElse;

  /**
   * The cached value of the '{@link #getEventElse() <em>Event Else</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventElse()
   * @generated
   * @ordered
   */
  protected EList<Event> eventElse;

  /**
   * The cached value of the '{@link #getInputParamsEventElse() <em>Input Params Event Else</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputParamsEventElse()
   * @generated
   * @ordered
   */
  protected EList<InputParam> inputParamsEventElse;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConditionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SmaCPackage.Literals.CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCondition(String newCondition)
  {
    String oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmaCPackage.CONDITION__CONDITION, oldCondition, condition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<RestrictionClause> getRestriction()
  {
    if (restriction == null)
    {
      restriction = new EObjectContainmentEList<RestrictionClause>(RestrictionClause.class, this, SmaCPackage.CONDITION__RESTRICTION);
    }
    return restriction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Properties> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Properties>(Properties.class, this, SmaCPackage.CONDITION__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getExpressions()
  {
    if (expressions == null)
    {
      expressions = new EDataTypeEList<String>(String.class, this, SmaCPackage.CONDITION__EXPRESSIONS);
    }
    return expressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Condition> getConditionalExpr()
  {
    if (conditionalExpr == null)
    {
      conditionalExpr = new EObjectContainmentEList<Condition>(Condition.class, this, SmaCPackage.CONDITION__CONDITIONAL_EXPR);
    }
    return conditionalExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<UnDeterminedLoop> getUndeterminedloops()
  {
    if (undeterminedloops == null)
    {
      undeterminedloops = new EObjectContainmentEList<UnDeterminedLoop>(UnDeterminedLoop.class, this, SmaCPackage.CONDITION__UNDETERMINEDLOOPS);
    }
    return undeterminedloops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ForLoop> getDeterminedloops()
  {
    if (determinedloops == null)
    {
      determinedloops = new EObjectContainmentEList<ForLoop>(ForLoop.class, this, SmaCPackage.CONDITION__DETERMINEDLOOPS);
    }
    return determinedloops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Event> getEvent()
  {
    if (event == null)
    {
      event = new EObjectResolvingEList<Event>(Event.class, this, SmaCPackage.CONDITION__EVENT);
    }
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<InputParam> getInputParamsEvent()
  {
    if (inputParamsEvent == null)
    {
      inputParamsEvent = new EObjectContainmentEList<InputParam>(InputParam.class, this, SmaCPackage.CONDITION__INPUT_PARAMS_EVENT);
    }
    return inputParamsEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<RestrictionClause> getRestrictionElse()
  {
    if (restrictionElse == null)
    {
      restrictionElse = new EObjectContainmentEList<RestrictionClause>(RestrictionClause.class, this, SmaCPackage.CONDITION__RESTRICTION_ELSE);
    }
    return restrictionElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Properties> getPropertiesElse()
  {
    if (propertiesElse == null)
    {
      propertiesElse = new EObjectContainmentEList<Properties>(Properties.class, this, SmaCPackage.CONDITION__PROPERTIES_ELSE);
    }
    return propertiesElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getExpressionsElse()
  {
    if (expressionsElse == null)
    {
      expressionsElse = new EDataTypeEList<String>(String.class, this, SmaCPackage.CONDITION__EXPRESSIONS_ELSE);
    }
    return expressionsElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Condition> getConditionalExprElse()
  {
    if (conditionalExprElse == null)
    {
      conditionalExprElse = new EObjectContainmentEList<Condition>(Condition.class, this, SmaCPackage.CONDITION__CONDITIONAL_EXPR_ELSE);
    }
    return conditionalExprElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<UnDeterminedLoop> getUndeterminedloopsElse()
  {
    if (undeterminedloopsElse == null)
    {
      undeterminedloopsElse = new EObjectContainmentEList<UnDeterminedLoop>(UnDeterminedLoop.class, this, SmaCPackage.CONDITION__UNDETERMINEDLOOPS_ELSE);
    }
    return undeterminedloopsElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ForLoop> getDeterminedloopsElse()
  {
    if (determinedloopsElse == null)
    {
      determinedloopsElse = new EObjectContainmentEList<ForLoop>(ForLoop.class, this, SmaCPackage.CONDITION__DETERMINEDLOOPS_ELSE);
    }
    return determinedloopsElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Event> getEventElse()
  {
    if (eventElse == null)
    {
      eventElse = new EObjectResolvingEList<Event>(Event.class, this, SmaCPackage.CONDITION__EVENT_ELSE);
    }
    return eventElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<InputParam> getInputParamsEventElse()
  {
    if (inputParamsEventElse == null)
    {
      inputParamsEventElse = new EObjectContainmentEList<InputParam>(InputParam.class, this, SmaCPackage.CONDITION__INPUT_PARAMS_EVENT_ELSE);
    }
    return inputParamsEventElse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SmaCPackage.CONDITION__RESTRICTION:
        return ((InternalEList<?>)getRestriction()).basicRemove(otherEnd, msgs);
      case SmaCPackage.CONDITION__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case SmaCPackage.CONDITION__CONDITIONAL_EXPR:
        return ((InternalEList<?>)getConditionalExpr()).basicRemove(otherEnd, msgs);
      case SmaCPackage.CONDITION__UNDETERMINEDLOOPS:
        return ((InternalEList<?>)getUndeterminedloops()).basicRemove(otherEnd, msgs);
      case SmaCPackage.CONDITION__DETERMINEDLOOPS:
        return ((InternalEList<?>)getDeterminedloops()).basicRemove(otherEnd, msgs);
      case SmaCPackage.CONDITION__INPUT_PARAMS_EVENT:
        return ((InternalEList<?>)getInputParamsEvent()).basicRemove(otherEnd, msgs);
      case SmaCPackage.CONDITION__RESTRICTION_ELSE:
        return ((InternalEList<?>)getRestrictionElse()).basicRemove(otherEnd, msgs);
      case SmaCPackage.CONDITION__PROPERTIES_ELSE:
        return ((InternalEList<?>)getPropertiesElse()).basicRemove(otherEnd, msgs);
      case SmaCPackage.CONDITION__CONDITIONAL_EXPR_ELSE:
        return ((InternalEList<?>)getConditionalExprElse()).basicRemove(otherEnd, msgs);
      case SmaCPackage.CONDITION__UNDETERMINEDLOOPS_ELSE:
        return ((InternalEList<?>)getUndeterminedloopsElse()).basicRemove(otherEnd, msgs);
      case SmaCPackage.CONDITION__DETERMINEDLOOPS_ELSE:
        return ((InternalEList<?>)getDeterminedloopsElse()).basicRemove(otherEnd, msgs);
      case SmaCPackage.CONDITION__INPUT_PARAMS_EVENT_ELSE:
        return ((InternalEList<?>)getInputParamsEventElse()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SmaCPackage.CONDITION__CONDITION:
        return getCondition();
      case SmaCPackage.CONDITION__RESTRICTION:
        return getRestriction();
      case SmaCPackage.CONDITION__PROPERTIES:
        return getProperties();
      case SmaCPackage.CONDITION__EXPRESSIONS:
        return getExpressions();
      case SmaCPackage.CONDITION__CONDITIONAL_EXPR:
        return getConditionalExpr();
      case SmaCPackage.CONDITION__UNDETERMINEDLOOPS:
        return getUndeterminedloops();
      case SmaCPackage.CONDITION__DETERMINEDLOOPS:
        return getDeterminedloops();
      case SmaCPackage.CONDITION__EVENT:
        return getEvent();
      case SmaCPackage.CONDITION__INPUT_PARAMS_EVENT:
        return getInputParamsEvent();
      case SmaCPackage.CONDITION__RESTRICTION_ELSE:
        return getRestrictionElse();
      case SmaCPackage.CONDITION__PROPERTIES_ELSE:
        return getPropertiesElse();
      case SmaCPackage.CONDITION__EXPRESSIONS_ELSE:
        return getExpressionsElse();
      case SmaCPackage.CONDITION__CONDITIONAL_EXPR_ELSE:
        return getConditionalExprElse();
      case SmaCPackage.CONDITION__UNDETERMINEDLOOPS_ELSE:
        return getUndeterminedloopsElse();
      case SmaCPackage.CONDITION__DETERMINEDLOOPS_ELSE:
        return getDeterminedloopsElse();
      case SmaCPackage.CONDITION__EVENT_ELSE:
        return getEventElse();
      case SmaCPackage.CONDITION__INPUT_PARAMS_EVENT_ELSE:
        return getInputParamsEventElse();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmaCPackage.CONDITION__CONDITION:
        setCondition((String)newValue);
        return;
      case SmaCPackage.CONDITION__RESTRICTION:
        getRestriction().clear();
        getRestriction().addAll((Collection<? extends RestrictionClause>)newValue);
        return;
      case SmaCPackage.CONDITION__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Properties>)newValue);
        return;
      case SmaCPackage.CONDITION__EXPRESSIONS:
        getExpressions().clear();
        getExpressions().addAll((Collection<? extends String>)newValue);
        return;
      case SmaCPackage.CONDITION__CONDITIONAL_EXPR:
        getConditionalExpr().clear();
        getConditionalExpr().addAll((Collection<? extends Condition>)newValue);
        return;
      case SmaCPackage.CONDITION__UNDETERMINEDLOOPS:
        getUndeterminedloops().clear();
        getUndeterminedloops().addAll((Collection<? extends UnDeterminedLoop>)newValue);
        return;
      case SmaCPackage.CONDITION__DETERMINEDLOOPS:
        getDeterminedloops().clear();
        getDeterminedloops().addAll((Collection<? extends ForLoop>)newValue);
        return;
      case SmaCPackage.CONDITION__EVENT:
        getEvent().clear();
        getEvent().addAll((Collection<? extends Event>)newValue);
        return;
      case SmaCPackage.CONDITION__INPUT_PARAMS_EVENT:
        getInputParamsEvent().clear();
        getInputParamsEvent().addAll((Collection<? extends InputParam>)newValue);
        return;
      case SmaCPackage.CONDITION__RESTRICTION_ELSE:
        getRestrictionElse().clear();
        getRestrictionElse().addAll((Collection<? extends RestrictionClause>)newValue);
        return;
      case SmaCPackage.CONDITION__PROPERTIES_ELSE:
        getPropertiesElse().clear();
        getPropertiesElse().addAll((Collection<? extends Properties>)newValue);
        return;
      case SmaCPackage.CONDITION__EXPRESSIONS_ELSE:
        getExpressionsElse().clear();
        getExpressionsElse().addAll((Collection<? extends String>)newValue);
        return;
      case SmaCPackage.CONDITION__CONDITIONAL_EXPR_ELSE:
        getConditionalExprElse().clear();
        getConditionalExprElse().addAll((Collection<? extends Condition>)newValue);
        return;
      case SmaCPackage.CONDITION__UNDETERMINEDLOOPS_ELSE:
        getUndeterminedloopsElse().clear();
        getUndeterminedloopsElse().addAll((Collection<? extends UnDeterminedLoop>)newValue);
        return;
      case SmaCPackage.CONDITION__DETERMINEDLOOPS_ELSE:
        getDeterminedloopsElse().clear();
        getDeterminedloopsElse().addAll((Collection<? extends ForLoop>)newValue);
        return;
      case SmaCPackage.CONDITION__EVENT_ELSE:
        getEventElse().clear();
        getEventElse().addAll((Collection<? extends Event>)newValue);
        return;
      case SmaCPackage.CONDITION__INPUT_PARAMS_EVENT_ELSE:
        getInputParamsEventElse().clear();
        getInputParamsEventElse().addAll((Collection<? extends InputParam>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SmaCPackage.CONDITION__CONDITION:
        setCondition(CONDITION_EDEFAULT);
        return;
      case SmaCPackage.CONDITION__RESTRICTION:
        getRestriction().clear();
        return;
      case SmaCPackage.CONDITION__PROPERTIES:
        getProperties().clear();
        return;
      case SmaCPackage.CONDITION__EXPRESSIONS:
        getExpressions().clear();
        return;
      case SmaCPackage.CONDITION__CONDITIONAL_EXPR:
        getConditionalExpr().clear();
        return;
      case SmaCPackage.CONDITION__UNDETERMINEDLOOPS:
        getUndeterminedloops().clear();
        return;
      case SmaCPackage.CONDITION__DETERMINEDLOOPS:
        getDeterminedloops().clear();
        return;
      case SmaCPackage.CONDITION__EVENT:
        getEvent().clear();
        return;
      case SmaCPackage.CONDITION__INPUT_PARAMS_EVENT:
        getInputParamsEvent().clear();
        return;
      case SmaCPackage.CONDITION__RESTRICTION_ELSE:
        getRestrictionElse().clear();
        return;
      case SmaCPackage.CONDITION__PROPERTIES_ELSE:
        getPropertiesElse().clear();
        return;
      case SmaCPackage.CONDITION__EXPRESSIONS_ELSE:
        getExpressionsElse().clear();
        return;
      case SmaCPackage.CONDITION__CONDITIONAL_EXPR_ELSE:
        getConditionalExprElse().clear();
        return;
      case SmaCPackage.CONDITION__UNDETERMINEDLOOPS_ELSE:
        getUndeterminedloopsElse().clear();
        return;
      case SmaCPackage.CONDITION__DETERMINEDLOOPS_ELSE:
        getDeterminedloopsElse().clear();
        return;
      case SmaCPackage.CONDITION__EVENT_ELSE:
        getEventElse().clear();
        return;
      case SmaCPackage.CONDITION__INPUT_PARAMS_EVENT_ELSE:
        getInputParamsEventElse().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SmaCPackage.CONDITION__CONDITION:
        return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
      case SmaCPackage.CONDITION__RESTRICTION:
        return restriction != null && !restriction.isEmpty();
      case SmaCPackage.CONDITION__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case SmaCPackage.CONDITION__EXPRESSIONS:
        return expressions != null && !expressions.isEmpty();
      case SmaCPackage.CONDITION__CONDITIONAL_EXPR:
        return conditionalExpr != null && !conditionalExpr.isEmpty();
      case SmaCPackage.CONDITION__UNDETERMINEDLOOPS:
        return undeterminedloops != null && !undeterminedloops.isEmpty();
      case SmaCPackage.CONDITION__DETERMINEDLOOPS:
        return determinedloops != null && !determinedloops.isEmpty();
      case SmaCPackage.CONDITION__EVENT:
        return event != null && !event.isEmpty();
      case SmaCPackage.CONDITION__INPUT_PARAMS_EVENT:
        return inputParamsEvent != null && !inputParamsEvent.isEmpty();
      case SmaCPackage.CONDITION__RESTRICTION_ELSE:
        return restrictionElse != null && !restrictionElse.isEmpty();
      case SmaCPackage.CONDITION__PROPERTIES_ELSE:
        return propertiesElse != null && !propertiesElse.isEmpty();
      case SmaCPackage.CONDITION__EXPRESSIONS_ELSE:
        return expressionsElse != null && !expressionsElse.isEmpty();
      case SmaCPackage.CONDITION__CONDITIONAL_EXPR_ELSE:
        return conditionalExprElse != null && !conditionalExprElse.isEmpty();
      case SmaCPackage.CONDITION__UNDETERMINEDLOOPS_ELSE:
        return undeterminedloopsElse != null && !undeterminedloopsElse.isEmpty();
      case SmaCPackage.CONDITION__DETERMINEDLOOPS_ELSE:
        return determinedloopsElse != null && !determinedloopsElse.isEmpty();
      case SmaCPackage.CONDITION__EVENT_ELSE:
        return eventElse != null && !eventElse.isEmpty();
      case SmaCPackage.CONDITION__INPUT_PARAMS_EVENT_ELSE:
        return inputParamsEventElse != null && !inputParamsEventElse.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (condition: ");
    result.append(condition);
    result.append(", expressions: ");
    result.append(expressions);
    result.append(", expressionsElse: ");
    result.append(expressionsElse);
    result.append(')');
    return result.toString();
  }

} //ConditionImpl
