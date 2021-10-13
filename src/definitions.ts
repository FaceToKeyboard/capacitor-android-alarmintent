export interface AndroidAlarmIntentPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
