# @facetokeyboard/android-alarmclock

Create and send AlarmClock intents

## Install

```bash
npm install @facetokeyboard/android-alarmclock
npx cap sync
```

## API

<docgen-index>

* [`echo(...)`](#echo)
* [`createAlarm(...)`](#createalarm)
* [`createTimer(...)`](#createtimer)
* [Interfaces](#interfaces)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### echo(...)

```typescript
echo(options: { value: string; }) => any
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ value: string; }</code> |

**Returns:** <code>any</code>

--------------------


### createAlarm(...)

```typescript
createAlarm(options: AlarmOptions) => any
```

| Param         | Type                                                  |
| ------------- | ----------------------------------------------------- |
| **`options`** | <code><a href="#alarmoptions">AlarmOptions</a></code> |

**Returns:** <code>any</code>

--------------------


### createTimer(...)

```typescript
createTimer(options: TimerOptions) => any
```

| Param         | Type                                                  |
| ------------- | ----------------------------------------------------- |
| **`options`** | <code><a href="#timeroptions">TimerOptions</a></code> |

**Returns:** <code>any</code>

--------------------


### Interfaces


#### AlarmOptions

| Prop          | Type                |
| ------------- | ------------------- |
| **`hour`**    | <code>number</code> |
| **`minute`**  | <code>number</code> |
| **`message`** | <code>string</code> |


#### TimerOptions

| Prop           | Type                |
| -------------- | ------------------- |
| **`duration`** | <code>number</code> |
| **`message`**  | <code>string</code> |

</docgen-api>
