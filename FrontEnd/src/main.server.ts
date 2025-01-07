import { bootstrapApplication } from '@angular/platform-browser';
import { AppComponent } from './app/typescript/app.component';
import { config } from './app/typescript/app.config.server';

const bootstrap = () => bootstrapApplication(AppComponent, config);

export default bootstrap;
