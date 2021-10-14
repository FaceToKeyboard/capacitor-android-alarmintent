import { WebPlugin } from '@capacitor/core';

import type { AndroidAlarmIntentPlugin } from './definitions';

export class AndroidAlarmIntentWeb extends WebPlugin implements AndroidAlarmIntentPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }

  async createAlarm(options: {hour: number, minute: number, message: string}): Promise<void> {
    throw this.unimplemented('Not implemented on web.');
  }

  async createTimer(options: {duration: number, message: string}): Promise<void> {
    throw this.unimplemented('Not implemented on web.');
  }

}
