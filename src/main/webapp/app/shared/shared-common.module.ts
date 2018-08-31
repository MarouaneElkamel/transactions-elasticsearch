import { NgModule } from '@angular/core';

import { TransactionsElasticsearchSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [TransactionsElasticsearchSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [TransactionsElasticsearchSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class TransactionsElasticsearchSharedCommonModule {}
