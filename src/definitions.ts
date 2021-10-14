export interface AndroidAlarmIntentPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  createAlarm(options: AlarmOptions): Promise<void>;
  createTimer(options: TimerOptions): Promise<void>;
}

export interface AlarmOptions {
  hour: number,
  minute: number,
  message: string
}

export interface TimerOptions {
  duration: number, 
  message: string
}
